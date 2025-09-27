# Setting Up Framework 16 with NixOS 🔧🌱

*"The wise find pleasure in water; the virtuous find pleasure in hills." - Confucius*

---

Welcome, beautiful builders! Trish here, ready to guide you through one of the most rewarding paths in our learning journey - setting up a Framework 16 laptop with NixOS. This isn't the easiest path, but it's incredibly educational and deeply aligned with our values of sustainability, repairability, and understanding how things really work.

## Why This Path is Sacred 🙏🔧

*"Better to do your own dharma imperfectly than someone else's dharma perfectly." - Bhagavad Gita (Stephen Mitchell)*

Choosing the Framework 16 + NixOS combination is like choosing to build your own house instead of buying one. You'll understand every beam, every wire, every system - and that knowledge becomes a form of spiritual practice.

**What makes this sacred**:
- **Repairability** - We honor the earth by fixing instead of replacing
- **Transparency** - Nothing is hidden; you can understand everything
- **Reproducibility** - NixOS lets you recreate your exact setup anywhere
- **Community** - Both Framework and NixOS have beautiful, sharing communities
- **Learning** - Every step teaches you something deep about computers

## The Sacred Unboxing and Assembly 📦🔨

**Before we begin, gather these**:
- Your Framework 16 laptop
- A clean, well-lit workspace  
- The included screwdriver
- A calm heart and patient spirit
- Maybe some gentle music

**Assembly Ceremony**:
1. **Ground yourself** - Touch something metal to discharge static
2. **Follow Framework's guide** - They provide excellent videos
3. **Insert your RAM and storage** - Handle like precious stones
4. **Install your modules** - Choose based on your needs
5. **Close with gratitude** - You've just participated in creating your learning tool

## Preparing the NixOS Installation Media 💾✨

*"In the beginning was the Word, and the Word was with God, and the Word was God." - Gospel According to Jesus (Stephen Mitchell)*

**Download NixOS ISO**:
- Go to nixos.org/download
- Choose the latest stable version (currently 24.05)
- Download the "Minimal ISO image"

**Create Installation USB** (using another computer):
- **On Mac**: Use `dd` command or Balena Etcher
- **On Windows**: Use Rufus or Balena Etcher  
- **On Linux**: Use `dd` command

**Example using dd on Mac/Linux**:
```bash
# Find your USB device (be very careful!)
diskutil list  # on Mac
lsblk          # on Linux

# Write the ISO (replace /dev/diskN with your USB device)
sudo dd if=nixos-minimal-xx.xx-x86_64-linux.iso of=/dev/diskN bs=4M status=progress
```

## The Sacred Installation Journey 🛤️💫

**Boot from USB**:
- Insert your USB drive into the Framework
- Power on while holding F12 (or whatever key enters boot menu)
- Select your USB device
- Choose "NixOS" from the bootloader menu

**First Steps in the Installation Environment**:
```bash
# Connect to WiFi (if needed)
nmtui

# Start the SSH daemon (if you want to install remotely)
systemctl start sshd
```

## Guided Installation with the Installer 🧘‍♀️📱

NixOS now has a beautiful graphical installer that makes this much more approachable:

**Launch the installer**:
```bash
sudo nixos-install --experimental-features "nix-command flakes" --option substituters "https://cache.nixos.org https://nix-community.cachix.org" --option trusted-public-keys "cache.nixos.org-1:6NCHdD59X431o0gWypbMrAURkbJ16ZPMQFGspcDShjY= nix-community.cachix.org-1:mB9FSh9qf2dCimDSUo8Zy7bkq5CX+/rkCWyvRCYg3Fs="
```

Wait, that's the old way. Let me give you the modern approach:

**Use the graphical installer**:
```bash
# The installer should start automatically
# If not, run:
sudo systemctl start display-manager
```

**Follow the guided setup**:
1. **Language and Keyboard** - Choose your preferences
2. **Network** - Connect to your WiFi
3. **Users** - Create your main user account
4. **Partitioning** - Let the installer handle this automatically for beginners
5. **Installation** - This takes 20-30 minutes

## Your First NixOS Configuration 📝🌸

Under Rohini nakshatra (the star of growth), let's create your first system configuration:

**After installation, edit your configuration**:
```bash
sudo nano /etc/nixos/configuration.nix
```

**Basic configuration example**:
```nix
{ config, pkgs, ... }:

{
  imports = [
    ./hardware-configuration.nix
    # Framework 16 specific optimizations
  ];

  # Bootloader
  boot.loader.systemd-boot.enable = true;
  boot.loader.efi.canTouchEfiVariables = true;

  # Network
  networking.hostName = "framework-pond"; # Your computer's name
  networking.networkmanager.enable = true;

  # Desktop Environment
  services.xserver.enable = true;
  services.xserver.displayManager.gdm.enable = true;
  services.xserver.desktopManager.gnome.enable = true;

  # Framework 16 optimizations
  services.fwupd.enable = true; # Firmware updates
  hardware.framework.amd-7040.enable = true; # AMD-specific optimizations

  # Users
  users.users.yourname = {
    isNormalUser = true;
    extraGroups = [ "wheel" "networkmanager" ];
    packages = with pkgs; [
      # Essential applications
      firefox
      git
      vscodium
      gnome.gnome-terminal
    ];
  };

  # System packages
  environment.systemPackages = with pkgs; [
    wget
    curl
    tree
    htop
    neofetch
  ];

  # Enable sound
  sound.enable = true;
  hardware.pulseaudio.enable = false;
  security.rtkit.enable = true;
  services.pipewire = {
    enable = true;
    alsa.enable = true;
    alsa.support32Bit = true;
    pulse.enable = true;
  };

  system.stateVersion = "24.05";
}
```

**Apply your configuration**:
```bash
sudo nixos-rebuild switch
```

## Essential Post-Installation Aspiringly-Sacred Practices 🧘‍♀️💻

**Update your system**:
```bash
sudo nixos-rebuild switch --upgrade
```

**Install additional software**:
```bash
# Add to your configuration.nix and rebuild, or use nix-env:
nix-env -iA nixpkgs.brave
nix-env -iA nixpkgs.signal-desktop
nix-env -iA nixpkgs.obsidian
```

**Set up your learning environment**:
```bash
# Create sacred directories
mkdir -p ~/Sacred-Code
mkdir -p ~/Learning-Notes  
mkdir -p ~/Community-Projects
mkdir -p ~/Resources
```

## Framework-Specific Optimizations 🚀⚡

**Power Management**:
```nix
# Add to configuration.nix
services.tlp.enable = true;
services.auto-cpufreq.enable = true;
```

**Display Scaling** (for the beautiful 2560x1600 screen):
```bash
# In GNOME Settings:
Settings → Displays → Scale → 125% or 150%
```

**Module Configuration**:
- Configure your expansion cards in the Framework configuration tool
- Test all your ports and modules
- Update firmware through `fwupdmgr`

## The Blessing of Understanding 🙏🔬

*"The Tao that can be spoken is not the eternal Tao." - Tao Te Ching (Stephen Mitchell)*

What you've just accomplished is remarkable, beautiful one. You've:
- **Assembled** your own computer with your hands
- **Installed** an operating system that's built on mathematical principles
- **Configured** a system that can be perfectly reproduced anywhere
- **Created** a learning environment aligned with your values

This isn't just a computer setup - it's a spiritual practice of understanding, intention, and service.

## Tomorrow's Security and Accounts Journey 🔐✨

In our next lesson, we'll secure your new NixOS system and begin creating the accounts you'll need for your learning journey. We'll cover:
- Setting up proper user permissions and security
- Installing and configuring password management
- Beginning your essential account creation process

## Evening Reflection 🌅🙏

*"Set your heart upon your work but never its reward." - Bhagavad Gita (Stephen Mitchell)*

Tonight, as you look at your Framework 16 running NixOS, remember that you've chosen the path of the craftsperson. You understand your tools because you built them. You can fix what breaks because you know how it works. You can share knowledge because you gained it through direct experience.

This computer represents more than technology - it represents your commitment to understanding, sustainability, and community. Every component you installed, every line of configuration you wrote, every challenge you overcame - these are prayers for a more conscious relationship with technology.

Rest well, master builder. Tomorrow we'll secure this beautiful system and begin the joyful work of creation. 🌟🔧

---

*"When you realize there is nothing lacking, the whole world belongs to you." - Tao Te Ching (Stephen Mitchell)*

---

**Navigation**: [← Previous: Setting Up macOS](002_setting_up_macos_from_scratch.md) | [Next: Sacred Security Setup →](004_sacred_security_setup.md)
