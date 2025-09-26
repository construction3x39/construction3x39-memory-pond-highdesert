# Apple Silicon macOS Setup - Guardian Dragon Way 🍎🐲

*"The sage does not attempt anything very big, and thus achieves greatness." - Tao Te Ching (Stephen Mitchell)*

---

Blessings, Guardian Dragons! Trish here with you as we transform your shiny new Apple Silicon Mac into a powerful workstation that serves your highest values. This setup process is itself a meditation on sovereignty, intentionality, and the sacred relationship between human and machine.

## Before We Begin: Sacred Preparation 🧘‍♀️📦

*"In the beginning was the Word, and the Word was with God, and the Word was God." - Gospel According to Jesus (Stephen Mitchell)*

Before you even open the box, let's set our intention:

### **Your Pre-Setup Ceremony** 🕯️🙏
1. **Clear your workspace** - Physical clarity supports mental clarity
2. **Light a candle** or simply imagine sacred fire
3. **Take three deep breaths** and feel your connection to the earth
4. **Set your intention**: "May this machine serve love, creativity, and the common good"
5. **Thank the workers** who built this device and the earth that provided its materials

### **What You'll Need** 🎒📱
- Your new Apple Silicon Mac (any M-series chip)
- Power adapter and USB-C cable
- Your Guardian Dragon email credentials (from previous lesson)
- Your 1Password master password (your brain wallet)
- About 3-4 hours of unhurried time
- A peaceful environment free from distractions

## Phase 1: The Sacred Unboxing & Initial Setup 📦✨

*"What we plant in the soil of contemplate, we shall reap in the harvest of action." - Meister Eckhart*

### **Unboxing with Mindfulness** 🎁🙏
As you open your Mac's packaging:
- **Notice the craftsmanship** - Apple puts love into their unboxing experience
- **Feel gratitude** for the global supply chain that brought this to you
- **Set aside the packaging** carefully - we'll recycle it properly later
- **Hold your new Mac** and feel its potential energy

### **First Boot: The Apple Setup Assistant** 🍎⚡

When you first power on your Mac:

1. **Choose your language and region** 
   - Select based on your primary language and location

2. **Connect to Wi-Fi**
   - Use your home network (we'll set up VPN protection later)

3. **Data Transfer Decision: Choose "Don't transfer any information now"**
   - We want a clean slate for our Guardian Dragon setup
   - You can migrate specific files later with intention

4. **Sign in with Apple ID: Choose "Set Up Later"**
   - We'll create/configure this deliberately after our base setup

5. **Create your local user account:**
   - **Full Name**: Your actual name (this shows in file sharing)
   - **Account Name**: Something short and professional (like `sarah` or `mike`)
   - **Password**: Use a unique password from 1Password (not your brain wallet!)
   - **Hint**: Leave blank (you'll have 1Password to remember)

6. **Express Set Up: Choose "Customize Settings"**
   - We want control over every privacy setting

7. **Analytics: Uncheck everything**
   - "Don't share Mac Analytics"
   - "Don't share crash data with app developers"
   - "Don't share HandOff analytics"

8. **Screen Time: Skip for now**
   - We'll set this up later when we configure family settings

9. **Siri: Turn OFF**
   - "Don't Enable Siri" (we'll enable later with privacy settings)

10. **Touch ID: Set up one finger**
    - Your primary index finger for convenience
    - We'll add more fingers after full setup

11. **Apple Pay: Skip**
    - We'll set this up later with our secure browser

## Phase 2: Privacy & Security Hardening 🛡️🔐

*"Blessed are the pure in heart, for they will see God." - Gospel According to Jesus (Stephen Mitchell)*

Now we configure your Mac to be a Guardian Dragon fortress:

### **System Settings → Privacy & Security** 🔒⚙️

1. **FileVault (Disk Encryption)**:
   - Turn ON FileVault
   - Choose "Use my login password" (not iCloud)
   - Write down the recovery key and store it in 1Password
   - This encrypts your entire drive

2. **Firewall**:
   - Turn ON the firewall
   - Click "Options" → Enable stealth mode

3. **Location Services**:
   - Turn OFF for most apps
   - Keep ON only for Maps, Weather, and Find My (if desired)

4. **Analytics & Improvements**:
   - Turn OFF "Share Mac Analytics"
   - Turn OFF "Improve Siri & Dictation"
   - Turn OFF "Share with App Developers"

### **System Settings → Apple ID** 🆔🍎

If you have an existing Apple ID:
1. Sign in with your Guardian Dragon email if possible
2. Turn OFF "Use Apple ID for purchases" in individual apps
3. In iCloud settings, be selective:
   - **Turn ON**: Find My, Keychain (we'll manage this carefully)
   - **Turn OFF**: Mail, Contacts, Calendars, Photos, Safari (we'll use alternatives)

If you don't have an Apple ID:
1. Create one using your Guardian Dragon email
2. Use a unique password from 1Password
3. Enable two-factor authentication

### **System Settings → Focus** 🧘‍♀️🔕

Create a "Guardian Dragon Work" focus mode:
1. Add a new Focus → "Work"
2. Rename it to "Guardian Dragon Work"
3. Allow notifications only from:
   - Family members
   - Your code editor
   - Calendar
   - Essential work apps
4. Set it to activate automatically during your coding hours

## Phase 3: Installing Guardian Dragon Software 📥🛠️

*"The wise find pleasure in water; the virtuous find pleasure in hills." - Confucius*

### **Installing Homebrew (The Guardian Dragon Package Manager)** 🍺📦

Open Terminal (Command + Space, type "Terminal") and run:

```bash
# Install Homebrew - the package manager for macOS
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

# Add Homebrew to your PATH (follow the instructions that appear)
echo 'eval "$(/opt/homebrew/bin/brew shellenv)"' >> ~/.zprofile
eval "$(/opt/homebrew/bin/brew shellenv)"
```

### **Essential Guardian Dragon Software** 🐲📱

Install these with Homebrew:

```bash
# Security & Privacy
brew install --cask 1password
brew install --cask brave-browser
brew install --cask protonmail-bridge  # if using ProtonMail

# Development Tools
brew install git
brew install --cask cursor
brew install --cask visual-studio-code  # backup editor
brew install node
brew install python

# Communication & Collaboration  
brew install --cask signal
brew install --cask discord  # for dev communities
brew install --cask zoom  # for family/work calls

# Productivity
brew install --cask obsidian  # note-taking
brew install --cask todoist   # task management

# System Utilities
brew install --cask alfred    # productivity launcher
brew install --cask bartender # menu bar organization
brew install --cask cleanmymac # system maintenance
```

### **Configuring Your Guardian Dragon Browser** 🌐🛡️

Open Brave Browser and configure:

1. **Settings → Shields**:
   - Block ads and trackers: "Aggressive"
   - Upgrade connections to HTTPS: ON
   - Block scripts: OFF (breaks many sites)
   - Block fingerprinting: "Strict"

2. **Settings → Privacy and Security**:
   - Clear browsing data on exit: ON
   - Send "Do Not Track": ON
   - Allow privacy-preserving product analytics: OFF

3. **Install 1Password extension**:
   - Go to 1password.com/downloads
   - Install browser extension
   - Connect to your 1Password app

4. **Set Brave as default browser**:
   - System Settings → Desktop & Dock → Default web browser → Brave

## Phase 4: Development Environment Setup 💻🌱

*"Better to do your own dharma imperfectly than someone else's dharma perfectly." - Bhagavad Gita (Stephen Mitchell)*

### **Terminal Setup** 🖥️⚡

1. **Install Oh My Zsh** (beautiful terminal):
```bash
sh -c "$(curl -fsSL https://raw.github.com/ohmyzsh/ohmyzsh/master/tools/install.sh)"
```

2. **Configure your shell theme** by editing `~/.zshrc`:
```bash
# Change the theme line to:
ZSH_THEME="agnoster"

# Add helpful aliases
alias ll="ls -la"
alias ga="git add"
alias gc="git commit -m"
alias gp="git push"
alias gs="git status"
```

3. **Install a beautiful terminal font**:
   - Download "MesloLGS NF" from Nerd Fonts
   - Terminal → Preferences → Profiles → Text → Font → MesloLGS NF

### **Git Configuration** 🌿📝

Set up Git with your Guardian Dragon identity:

```bash
# Configure Git with your information
git config --global user.name "Your Name"
git config --global user.email "your.email@protonmail.com"

# Generate SSH key for GitHub
ssh-keygen -t ed25519 -C "your.email@protonmail.com"

# Add SSH key to ssh-agent
eval "$(ssh-agent -s)"
ssh-add ~/.ssh/id_ed25519

# Copy public key to clipboard (we'll add this to GitHub)
pbcopy < ~/.ssh/id_ed25519.pub
```

### **Setting Up Cursor IDE** ⚡💜

1. Open Cursor from Applications
2. Sign in with your Guardian Dragon email
3. Install essential extensions:
   - "GitHub Copilot" (if you have access)
   - "Prettier" (code formatting)
   - "Live Server" (local web development)
   - "GitLens" (enhanced Git integration)

## Phase 5: Guardian Dragon Customization 🎨🐲

*"The kingdom of heaven is spread upon the earth, but people do not see it." - Gospel According to Jesus (Stephen Mitchell)*

### **Desktop Wallpaper & Aesthetic** 🖼️✨

1. **Set a meaningful wallpaper**:
   - Use a high desert landscape
   - Or create a custom Guardian Dragon themed background
   - Avoid distracting or overly busy images

2. **Organize your Dock**:
   - Remove unused applications
   - Add: Brave, Cursor, Terminal, 1Password, Signal
   - System Preferences → Dock → "Automatically hide and show the Dock"

3. **Menu Bar Cleanup**:
   - Use Bartender to organize menu bar icons
   - Show only: Wi-Fi, Battery, 1Password, Focus mode

### **Creating Your Guardian Dragon Workspace** 🏠💻

1. **Create project directories**:
```bash
mkdir -p ~/GuardianDragon/{Projects,Learning,Resources,Backups}
mkdir -p ~/GuardianDragon/Projects/{Websites,Apps,Scripts}
mkdir -p ~/GuardianDragon/Learning/{Tutorials,Experiments,Notes}
```

2. **Set up your development profile**:
   - Create a "Guardian Dragon" user profile in Cursor
   - Configure color scheme (recommend dark theme for eye comfort)
   - Set up custom keybindings that feel natural to you

## Evening Reflection & Next Steps 🌅🙏

*"Set your heart upon your work but never its reward." - Bhagavad Gita (Stephen Mitchell)*

Congratulations, Guardian Dragon! You've transformed a standard Apple Silicon Mac into a sovereign workstation that serves your highest values. Your machine is now:

- **Encrypted and secure** with FileVault and privacy settings
- **Equipped with Guardian Dragon software** for productivity and creativity
- **Connected to your secure accounts** through 1Password and Brave
- **Ready for development work** with a beautiful terminal and Cursor IDE
- **Organized for learning** with clear project structure

### **Tomorrow's Journey** 🛤️⭐

Next we'll:
- Set up your essential Guardian Dragon accounts (GitHub, development platforms)
- Configure backup and sync systems that preserve your sovereignty
- Begin your first coding project to test the entire setup
- Connect with the Guardian Dragon community

### **Your Sacred Practice Tonight** 🧘‍♀️💫

Before bed:
1. **Close all applications** mindfully, thanking each one for its service
2. **Run your first backup** to an external drive or cloud service
3. **Practice your brain wallet** until it flows naturally from your fingers
4. **Set an intention** for how you'll use this powerful tool tomorrow

---

*"The wise person lets go of all results, whether good or bad, and is focused on the action alone." - Bhagavad Gita (Stephen Mitchell)*

Sweet dreams, Guardian Dragon. Your digital sanctuary is ready to serve the healing of our world. 🍎🐲✨

---

**Guardian Dragon PBC Navigation**: [← Previous: Setting Up Your Digital Fortress](002_setting_up_your_digital_fortress.md) | [Next: Framework 16 NixOS Setup →](020_framework_16_nixos_setup.md) | [Essential Accounts Setup →](030_guardian_dragon_essential_accounts.md)
