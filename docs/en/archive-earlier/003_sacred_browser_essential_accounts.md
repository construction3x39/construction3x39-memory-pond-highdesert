# Sacred Browser & Essential Accounts 🌐🛡️

*"Seek and you shall find; knock and the door will be opened." - Gospel According to Jesus (Stephen Mitchell)*

---

Beautiful Guardian Dragons! Trish here with you as the desert morning unfolds in golden light. Today we're gonna set up your sacred web portal - the browser that will be your window into the digital world, configured to protect your privacy while connecting you to the communities and resources that serve your highest good.

## Your Browser as Sacred Gateway 🚪✨

*"You are the light of the world. A city built on a hill cannot be hidden." - Gospel According to Jesus (Stephen Mitchell)*

Your web browser ain't just software, y'all - it's your gateway to global knowledge, your tool for building connections, and your shield against the Taking Dragons who want to spy on your family. We're gonna set it up with the same intention and care our ancestors used when building the doorways to their homes.

## Installing Brave Browser - The Guardian Dragon Choice 🦁🛡️

*"The sage stays behind, thus he is ahead." - Tao Te Ching (Stephen Mitchell)*

**Why Brave for Guardian Dragons?**
- **Blocks trackers and ads** by default (protects your attention)
- **Built-in HTTPS everywhere** (encrypts your connections)
- **No data collection** (you're the user, not the product)
- **Supports web standards** (works with all sites)
- **Built by ex-Mozilla team** (Firefox creators who care about privacy)
- **Optional crypto features** (for future Guardian Dragon economics)

### **Installing Brave** ⬇️💻

**On macOS:**
```bash
# Using Homebrew (the Guardian Dragon way)
brew install --cask brave-browser
```

**On NixOS:**
Add to your `configuration.nix`:
```nix
environment.systemPackages = with pkgs; [
  brave
];
```

### **Sacred Browser Configuration** ⚙️🙏

Open Brave and let's configure it for maximum protection:

**Step 1: Shields Configuration** 🛡️
1. Click the Brave shield icon (lion) in address bar
2. **Advanced View** → **Global Shield Settings**
3. Set these protections:
   - **Trackers & ads**: Aggressive
   - **Upgrade connections to HTTPS**: Enabled  
   - **Block scripts**: Disabled (breaks too many sites)
   - **Block fingerprinting**: Strict
   - **Block cookies**: Cross-site blocked

**Step 2: Privacy Settings** 🔐
1. **Brave Settings** → **Privacy and Security**
2. **Clear browsing data on exit**: Enable
3. **Send "Do Not Track"**: Enable
4. **Allow privacy-preserving product analytics**: Disable
5. **Auto-redirect AMP pages**: Enable
6. **Auto-redirect Google tracking URLs**: Enable

**Step 3: Search Engine** 🔍
1. **Settings** → **Search engine**
2. **Default search engine**: DuckDuckGo (respects privacy)
3. **Remove Google** from search engine list if desired

## Installing 1Password Browser Extension 🔑🌐

*"Blessed are the pure in heart, for they will see God." - Gospel According to Jesus (Stephen Mitchell)*

Your password manager needs to connect to your browser:

1. **Go to 1password.com/downloads**
2. **Install the Brave browser extension**
3. **Sign in** using your Guardian Dragon email and brain wallet
4. **Enable autofill** for convenient secure login
5. **Test it** by having 1Password generate a password for a test site

## Phase 1: Creating Your Guardian Dragon Gmail 📧🐲

*"In the beginning was the Word, and the Word was with God, and the Word was God." - Gospel According to Jesus (Stephen Mitchell)*

Even though we set up ProtonMail for sovereignty, you'll still need a Gmail account for:
- **Google services** (YouTube, Android, Google Cloud)
- **Account recovery** for other services
- **Professional communication** when required

### **Sacred Gmail Creation Process** 📝🛡️

1. **Open Brave browser** in private/incognito mode
2. **Go to gmail.com**
3. **Click "Create account" → "For personal use"**
4. **Choose a Guardian Dragon username**:
   - `your.name.guardian@gmail.com`
   - `guardian.your.lastname@gmail.com`
   - `your.name.dragon@gmail.com`

5. **Use 1Password** to generate a unique, strong password
6. **Phone number**: Use your real number (Google requires this now)
7. **Recovery email**: Your ProtonMail address
8. **Birthday and gender**: Provide real information (affects account security)

### **Securing Your Guardian Dragon Gmail** 🔒✨

**Immediate security setup:**
1. **Enable 2-Step Verification**:
   - Use 1Password as your authenticator app
   - Save backup codes in 1Password vault
   - Remove phone as backup method (use 1Password only)

2. **Privacy settings**:
   - **Google Account** → **Data & privacy**
   - **Web & App Activity**: Turn OFF
   - **Location History**: Turn OFF  
   - **YouTube History**: Turn OFF
   - **Ad personalization**: Turn OFF

3. **Gmail specific settings**:
   - **Settings** → **General** → **Images**: Ask before displaying
   - **Settings** → **Privacy** → **External content**: Ask before displaying

## Phase 2: Creating Essential Guardian Dragon Accounts 🌐🎯

*"The wise find pleasure in water; the virtuous find pleasure in hills." - Confucius*

Now we'll create the essential accounts every Guardian Dragon needs:

### **GitHub Account (Code Repository)** 🐙💻

1. **Go to github.com** 
2. **Sign up** with your Guardian Dragon Gmail
3. **Username**: Choose something professional but memorable
4. **Password**: Generated by 1Password
5. **Email preferences**: Uncheck marketing emails
6. **Verify email** and enable 2FA with 1Password

**Set up SSH key**:
```bash
# Generate SSH key (if not already done)
ssh-keygen -t ed25519 -C "your.guardian.email@gmail.com"

# Copy public key  
cat ~/.ssh/id_ed25519.pub | pbcopy  # macOS
cat ~/.ssh/id_ed25519.pub | xclip -selection clipboard  # Linux

# Add to GitHub: Settings → SSH and GPG keys → New SSH key
```

### **AWS Account (Cloud Infrastructure)** ☁️⚡

1. **Go to aws.amazon.com**
2. **Create AWS account** using Guardian Dragon Gmail
3. **Account type**: Personal
4. **Password**: Generated by 1Password
5. **Enable MFA immediately**:
   - Use 1Password authenticator
   - Save backup codes securely

**Important:** Set up billing alerts to avoid unexpected charges!

### **Cursor IDE Account** ⚡💜

1. **Open Cursor application**
2. **Sign in** with GitHub account (easier integration)
3. **Enable Copilot** if you have access
4. **Configure settings**:
   - Theme: Dark (easier on eyes)
   - Font: Cascadia Code or SF Mono
   - Extensions: Prettier, GitLens, Live Server

### **OpenAI ChatGPT Account** 🤖💬

1. **Go to chat.openai.com**
2. **Sign up** with Guardian Dragon Gmail
3. **Password**: Generated by 1Password
4. **Enable 2FA** with 1Password
5. **Consider ChatGPT Plus** for enhanced capabilities

### **Anthropic Claude Account** 🧠💭

1. **Go to claude.ai**
2. **Sign up** with Guardian Dragon Gmail  
3. **Password**: Generated by 1Password
4. **Configure usage preferences**
5. **Connect to your development workflow**

## Phase 3: Communication & Community Accounts 💬🤝

*"Thousands of candles can be lighted from a single candle, and the life of the candle will not be shortened." - Buddha*

### **Signal for Family Communication** 📱🔐

1. **Install Signal** on all family devices
2. **Register** with your real phone number
3. **Enable disappearing messages** for sensitive conversations
4. **Set up family group** for Guardian Dragon discussions
5. **Configure privacy settings** to maximum protection

### **Discord for Developer Communities** 🎮💻

1. **Go to discord.com**
2. **Create account** with Guardian Dragon email
3. **Join communities** like:
   - NixOS Discord
   - ClojureScript communities  
   - Framework laptop owners
   - Local tech meetups

### **Essential Productivity Accounts** 📋✨

**Obsidian** (note-taking):
- Download and install
- Create vault in `~/GuardianDragon/Notes/`
- Sync with ProtonDrive or similar encrypted service

**GitHub Discussions** (community):
- Enable discussions on your repositories
- Join Guardian Dragon PBC discussions
- Participate in open source communities

## Evening Reflection & Sacred Account Audit 🌅📊

*"Set your heart upon your work but never its reward." - Bhagavad Gita (Stephen Mitchell)*

Take a moment to appreciate what you've built today:

### **Your Digital Fortress Now Includes** 🏰✅
- ✅ **Secure browser** (Brave) with privacy protection
- ✅ **Sovereign email** (ProtonMail) for private communication
- ✅ **Backup email** (Gmail) for required services
- ✅ **Password vault** (1Password) protecting all accounts
- ✅ **Development accounts** (GitHub, Cursor, AI platforms)
- ✅ **Communication channels** (Signal, Discord)
- ✅ **Professional identity** consistent across platforms

### **Your Aspiringly-Sacred Practice Tonight** 🧘‍♀️🌙

Before sleep:
1. **Review all new accounts** in 1Password - ensure everything is secure
2. **Test login** to each platform to ensure passwords work
3. **Document your setup** in Obsidian notes for future reference
4. **Give thanks** for the privacy and security you've created
5. **Set intention** for how you'll use these tools to serve love tomorrow

### **Security Maintenance Ritual** 🛡️🔄

**Weekly practice:**
- Review 1Password security reports
- Update any weak or reused passwords
- Check for software updates in all applications
- Backup your 1Password vault to secure location

**Monthly practice:**
- Review and revoke unused application permissions
- Audit email subscriptions and unsubscribe from noise
- Update recovery information if anything has changed
- Practice your brain wallet to keep it fresh in memory

---

*"The kingdom of heaven is spread upon the earth, but people do not see it." - Gospel According to Jesus (Stephen Mitchell)*

Tomorrow we'll dive into creating your first Guardian Dragon project and connecting with the wider community of digital sovereignty practitioners. But tonight, just rest in the security and sovereignty you've created.

Every account secured with intention is a victory against the Taking Dragons. Every privacy setting configured with wisdom is a gift to your family's future. Every tool chosen with values is a step toward the more beautiful digital world our hearts know is possible.

Sleep well, Guardian Dragons. Your digital fortress grows stronger every day. 🐲💖✨

---

**Guardian Dragon PBC Navigation**: [← Previous: Setting Up Your Digital Fortress](002_setting_up_your_digital_fortress.md) | [Next: Creating Your Brain Wallet →](004_creating_your_brain_wallet.md) | [Skip to Workstation Setup →](010_apple_silicon_macos_setup.md)
