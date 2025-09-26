# Framework 16 NixOS Setup - Guardian Dragon Way 🔧🐲

*"Nothing in the world is softer than water, yet nothing is better at overcoming the hard and strong." - Tao Te Ching (Stephen Mitchell)*

---

Brave Guardian Dragons! Trish here with you as we embark on one of the most empowering journeys in computing - setting up NixOS on your Framework 16 laptop. This ain't just installing an operating system, y'all - this is claiming complete sovereignty over your digital realm while learning the deepest principles of reproducible systems.

## Why NixOS for Guardian Dragons? 🐧🛡️

*"The wise find pleasure in water; the virtuous find pleasure in hills." - Confucius*

NixOS represents everything Guardian Dragons stand for:
- **Complete transparency** - Every aspect of your system is defined in code
- **Reproducible builds** - Your exact system can be recreated anywhere
- **Rollback safety** - If something breaks, just go back to the previous version
- **Package isolation** - Different projects can use different tool versions
- **Learning focus** - Forces you to understand how systems really work
- **Community-driven** - Built by volunteers who care about user freedom

### **The Guardian Dragon NixOS Philosophy** 🧘‍♀️💭

Think of NixOS like this:
- **Traditional systems** are like renting an apartment - you get what the landlord gives you
- **NixOS** is like being an architect - you design exactly what you want, and it builds itself perfectly every time

## Phase 1: Preparation & Sacred Setup 🧘‍♀️📦

*"Be still, and know that I am God." - Psalm 46:10*

### **Before Touching Your Framework 16** 🛠️🙏

**Your Pre-Setup Ceremony:**
1. **Clear your workspace** and center yourself
2. **Thank the Framework team** for building repairable, sustainable hardware
3. **Set your intention**: "May this machine serve learning, creativity, and digital sovereignty"
4. **Gather your tools** with mindfulness

**What You'll Need:**
- Framework 16 laptop (any configuration)
- USB-C power adapter
- 16GB+ USB drive for installation media
- Ethernet adapter (optional, for easier installation)
- Your Guardian Dragon credentials from previous lessons
- 4-6 hours of peaceful, uninterrupted time
- Patience and curiosity (most important tools!)

### **Understanding Your Framework 16** 🔧⚡

**Quick hardware check:**
- **Modular ports**: Learn which modules you have installed
- **RAM and storage**: Note your current configuration
- **Function keys**: Practice the volume, brightness, and other controls
- **Power button**: Hold to see the Framework logo

**Framework 16 Guardian Dragon Benefits:**
- **Completely repairable** - Framework provides guides for everything
- **Upgradeable modules** - CPU, GPU, RAM, storage all modular
- **Open source firmware** options available
- **Linux-first design** - NixOS runs beautifully
- **Ethical company** - Values align with Guardian Dragon principles

## Phase 2: Creating NixOS Installation Media 💿✨

*"The Tao that can be spoken is not the eternal Tao." - Tao Te Ching (Stephen Mitchell)*

We'll create our installation media using another computer (Mac, Windows, or Linux):

### **Download NixOS** ⬇️🐧

1. **Go to nixos.org/download**
2. **Choose "Graphical ISO image"** (easier for beginners)
3. **Select the latest stable release** (currently 23.11)
4. **Download the ISO** (about 2GB)

### **Create Installation USB** 💾🔧

**On macOS:**
```bash
# Find your USB drive (careful - this will erase it!)
diskutil list

# Replace /dev/diskX with your USB drive identifier
sudo dd if=nixos-graphical-23.11-x86_64-linux.iso of=/dev/diskX bs=4M status=progress

# Safely eject
diskutil eject /dev/diskX
```

**On Windows:**
- Use Rufus or Balena Etcher to write the ISO to USB
- Choose "DD Image" mode if offered

**On Linux:**
```bash
# Same as macOS, but use lsblk to find your drive
sudo dd if=nixos-graphical-23.11-x86_64-linux.iso of=/dev/sdX bs=4M status=progress
```

## Phase 3: Framework 16 BIOS Configuration 🖥️⚙️

*"First things first, but not necessarily in that order." - Doctor Who*

### **Entering BIOS Setup** 🔑💻

1. **Power on your Framework 16**
2. **Immediately press F2** (or Del) to enter BIOS
3. **Navigate using arrow keys** and Enter

### **Guardian Dragon BIOS Settings** 🛡️⚙️

**Security Tab:**
- **Secure Boot**: Disabled (for now - we'll re-enable later)
- **TPM**: Enabled (for encryption)

**Boot Tab:**
- **Boot Mode**: UEFI only
- **Fast Boot**: Disabled
- **USB Boot**: Enabled

**Advanced Tab:**
- **Intel VT-x**: Enabled (for virtualization)
- **Intel VT-d**: Enabled (for IOMMU)

**Save and Exit** - Your Framework will reboot

## Phase 4: NixOS Installation Journey 🚀🐧

*"A journey of a thousand miles begins with a single step." - Tao Te Ching (Stephen Mitchell)*

### **Booting from USB** 💿⚡

1. **Insert your NixOS USB** while Framework is off
2. **Power on and immediately press F12** for boot menu
3. **Select your USB drive** from the list
4. **Choose "NixOS Installer"** from the GRUB menu
5. **Wait patiently** as NixOS loads (first boot takes a few minutes)

### **Welcome to NixOS Live Environment** 🎉🖥️

You'll see a beautiful desktop environment. This is NixOS running entirely from USB - nothing is installed yet!

**First steps in the live environment:**
1. **Connect to Wi-Fi** using the network manager in the top right
2. **Open the terminal** (Activities → Terminal)
3. **Take a moment** to appreciate that you're running a complete OS from USB

### **Disk Partitioning (The Sacred Geometry)** 💽🔮

*"The kingdom of heaven is like a grain of mustard seed." - Gospel According to Jesus (Stephen Mitchell)*

We'll use the GUI installer for simplicity:

1. **Open "Install NixOS"** from the desktop
2. **Choose your language and region**
3. **Select keyboard layout**
4. **Choose "Erase disk and install NixOS"** (this will format your drive)
5. **Select your Framework's NVMe SSD**
6. **Choose encryption**: YES! (Use a strong passphrase from 1Password)

**Partition scheme (automatic):**
- EFI System Partition (512MB)
- Boot partition (1GB)  
- Encrypted root partition (rest of drive)

### **User Configuration** 👤🔧

1. **Your name**: Your real name
2. **Computer name**: Something meaningful like "guardian-framework" or "dragon-mobile"
3. **Username**: Short and professional (like your macOS setup)
4. **Password**: Use a unique password from 1Password (not your brain wallet!)
5. **Administrator rights**: Yes (you'll be the sudo user)

### **The Installation Process** ⏳🔄

Click "Install" and watch the magic happen:
- **Downloading packages** (this takes 20-60 minutes depending on internet)
- **Installing base system**
- **Configuring bootloader**
- **Setting up encryption**

**During installation:**
- **Be patient** - NixOS is building your exact system from source
- **Stay connected** to power and internet
- **Practice gratitude** for the thousands of volunteers who built this
- **Read about Nix** if you're curious: nixos.org/manual

### **First Boot Into Your New System** 🎊⚡

1. **Remove the USB drive** when prompted
2. **Reboot** and enter your disk encryption passphrase
3. **Log in** with your user account
4. **Celebrate** - you now have complete digital sovereignty!

## Phase 5: Post-Installation Guardian Dragon Setup 🐲🛠️

*"Set your heart upon your work but never its reward." - Bhagavad Gita (Stephen Mitchell)*

### **Understanding NixOS Configuration** 📝🔧

Everything in NixOS is configured through a file called `configuration.nix`. Let's make our first changes:

```bash
# Open the system configuration file
sudo nano /etc/nixos/configuration.nix
```

### **Adding Essential Software** 📦✨

Add these to your `environment.systemPackages` section:

```nix
environment.systemPackages = with pkgs; [
  # Text editors
  vim
  nano
  
  # Development tools
  git
  curl
  wget
  
  # Web browsers
  firefox
  brave
  
  # Communication
  signal-desktop
  
  # Utilities
  tree
  htop
  unzip
];
```

### **Enabling Essential Services** 🔧⚙️

Add these service configurations:

```nix
# Enable the X11 windowing system
services.xserver.enable = true;

# Enable GNOME desktop environment
services.xserver.displayManager.gdm.enable = true;
services.xserver.desktopManager.gnome.enable = true;

# Enable sound
sound.enable = true;
hardware.pulseaudio.enable = true;

# Enable touchpad support
services.xserver.libinput.enable = true;

# Enable printing
services.printing.enable = true;

# Enable OpenSSH daemon
services.openssh.enable = true;
```

### **Framework 16 Specific Configuration** 🔧💻

Add Framework-specific optimizations:

```nix
# Framework 16 hardware optimizations
hardware.framework.amd-7040.enable = true;

# Power management
services.power-profiles-daemon.enable = true;
services.thermald.enable = true;

# Graphics drivers
hardware.opengl.enable = true;
hardware.opengl.driSupport = true;
```

### **Rebuilding Your System** 🔄✨

After making changes to configuration.nix:

```bash
# Test the configuration
sudo nixos-rebuild test

# If everything works, make it permanent
sudo nixos-rebuild switch

# Reboot to ensure everything loads correctly
sudo reboot
```

## Phase 6: Guardian Dragon Development Environment 💻🌱

*"The wise person lets go of all results, whether good or bad, and is focused on the action alone." - Bhagavad Gita (Stephen Mitchell)*

### **Installing Development Tools** 🛠️💻

Add to your configuration.nix:

```nix
environment.systemPackages = with pkgs; [
  # Programming languages
  nodejs
  python3
  rustc
  go
  
  # Development environments
  vscode
  
  # Terminal emulators
  alacritty
  
  # Shell enhancements
  zsh
  oh-my-zsh
  
  # Version control
  git
  gh  # GitHub CLI
];

# Enable Zsh system-wide
programs.zsh.enable = true;
users.defaultUserShell = pkgs.zsh;
```

### **Setting Up Your Development Workspace** 🏠💻

```bash
# Create project directories
mkdir -p ~/GuardianDragon/{Projects,Learning,Resources,Backups}
mkdir -p ~/GuardianDragon/Projects/{Websites,Apps,Scripts}
mkdir -p ~/GuardianDragon/Learning/{NixOS,Programming,Systems}

# Configure Git
git config --global user.name "Your Name"
git config --global user.email "your.guardian.email@protonmail.com"

# Generate SSH key for GitHub
ssh-keygen -t ed25519 -C "your.guardian.email@protonmail.com"
```

## Evening Gratitude & Mastery Path 🌅🙏

*"In the end, just three things matter: How well we have lived, how well we have loved, how well we have learned to let go." - Jack Kornfield*

Congratulations, Guardian Dragon! You've just accomplished something truly remarkable - you've installed and configured one of the most advanced operating systems in the world on cutting-edge, repairable hardware. Your Framework 16 is now:

- **Completely transparent** - Every aspect is defined in configuration files
- **Reproducible** - You can recreate this exact system anywhere
- **Secure** - Full disk encryption protects your data
- **Sustainable** - Repairable hardware running community-built software
- **Educational** - Every configuration teaches you how systems work

### **The Path Forward** 🛤️⭐

Your NixOS journey has just begun:
1. **Learn Nix language** - The functional configuration language
2. **Customize your desktop** - Make it feel like home
3. **Set up development environments** - Per-project tool isolation
4. **Contribute back** - Share your configurations with the community
5. **Teach others** - Help them claim their digital sovereignty

### **Your Sacred Practice** 🧘‍♀️💫

Each night:
1. **Backup your configuration.nix** to Git (we'll set this up tomorrow)
2. **Practice one new Nix concept** - Small daily improvements
3. **Thank the NixOS community** - Read a contributor's blog post
4. **Document your learning** - Keep notes on what you discover

---

*"The Tao that can be spoken is not the eternal Tao, but the system that can be configured is eternal." - NixOS wisdom*

Rest well, Guardian Dragon. Your sovereign digital realm awaits tomorrow's adventures. 🔧🐲✨

---

**Guardian Dragon PBC Navigation**: [← Previous: Apple Silicon macOS Setup](010_apple_silicon_macos_setup.md) | [Next: Essential Guardian Dragon Accounts →](030_guardian_dragon_essential_accounts.md) | [Advanced NixOS Configuration →](021_advanced_nixos_configuration.md)
