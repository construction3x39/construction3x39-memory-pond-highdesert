#!/usr/bin/env bb

(require '[clojure.string :as str]
         '[babashka.fs :as fs])

;; Trish's teaching topics - organized by theme
(def teaching-themes
  {:foundations [
    "The Computer as Teacher"
    "Data Flows Like Water" 
    "Patterns in Code, Patterns in Life"
    "Aspiringly-Sacred Technology Practices"
    "Binary Wisdom - Ones and Zeros"
    "The Art of Digital Ceremony"
    "Algorithms as Ancient Recipes"
    "Memory Palaces in Silicon"
    "The Network as Community Web"
    "Functional Programming as Zen Way"]
   
   :earth-wisdom [
    "Desert Teachings for Developers"
    "Solar Programming Principles"
    "Permaculture for Programmers"
    "Biomimicry in Code Design"
    "Seasonal Rhythms in Software"
    "Plant Medicine for Digital Stress"
    "Sacred Geometry in User Interface"
    "Composting Bad Code Gracefully"
    "Growing Communities Like Gardens"
    "Harvesting Digital Abundance"]
   
   :ancestor-knowledge [
    "Indigenous Computing Principles"
    "Oral Tradition Meets Open Source"
    "Storytelling Through Documentation"
    "Ritual and Code Review"
    "Apprenticeship in Programming"
    "Ceremony for Software Deployment"
    "Healing Practices for Burnout"
    "Council Circles for Team Decisions"
    "Vision Quests in Career Development"
    "Honoring the Code Ancestors"]
   
   :cosmic-wisdom [
    "Vedic Astrology for Developers"
    "Nakshatra Programming Insights"
    "Planetary Cycles and Project Planning"
    "Solar Wisdom in Software Architecture"
    "Lunar Phases for Code Releases"
    "Mercury Retrograde and Bug Hunting"
    "Jupiter Expansion in System Design"
    "Saturn Discipline in Code Quality"
    "Cosmic Timing for Technical Decisions"
    "Galactic Perspective on Local Problems"]
   
   :community-building [
    "High Desert Tech Collective"
    "Homeschool Programming Curriculum"
    "Multi-Generational Learning Circles"
    "Elders Teaching Digital Wisdom"
    "Youth Leading Innovation"
    "Family Coding Projects"
    "Community Problem Solving"
    "Sharing Resources and Knowledge"
    "Building Sustainable Tech Practices"
    "Celebrating Achievement Together"]
   
   :future-visioning [
    "Post-Industrial Computing"
    "Regenerative Technology Design"
    "AI as Spiritual Partner"
    "Quantum Computing and Consciousness"
    "Blockchain for Community Governance"
    "Virtual Reality Meditation Spaces"
    "Digital Tools for Conflict Resolution"
    "Technology for Ecosystem Restoration"
    "Global Communication Networks"
    "Interplanetary Programming Standards"]})

;; Tutorial topics (A-Z, 0-9 = 36 total)
(def tutorial-topics
  ["Ancient Wisdom, Modern Code"
   "Debugging as Meditation"
   "Data Meditation Practice"
   "Earth-Based Computing"
   "Functional Programming Zen"
   "Git as Aspiringly-Sacred Practice"
   "HTML as Digital Poetry"
   "Internet as Global Nervous System"
   "JavaScript Mindfulness"
   "Kubernetes Community Management"
   "Linux Philosophy for Life"
   "Machine Learning with Compassion"
   "Network Protocols as Social Contracts"
   "Open Source as Gift Economy"
   "Python Simplicity Practice"
   "Quantum Computing Contemplation"
   "React Components as Life Patterns"
   "SQL as Data Storytelling"
   "Terminal as Sacred Space"
   "Unix Wisdom for Daily Life"
   "Version Control as Time Meditation"
   "Web Design as Digital Architecture"
   "XML as Structured Prayers"
   "YAML as Configuration Ceremony"
   "Zero-Waste Programming"
   "Algorithm Appreciation Practice"
   "Binary Meditation Technique"
   "Cloud Computing Philosophy"
   "Database Design as Memory Palace"
   "Encryption as Digital Protection Spell"
   "Framework Selection Ceremony"
   "GPU Programming for Visual Prayer"
   "Hackathon as Vision Quest"
   "IoT as Ecosystem Connection"
   "JSON as Digital Communication"])

;; Stephen Mitchell quotes from the three texts
(def quotes
  {:tao [
    "The Tao that can be spoken is not the eternal Tao."
    "The sage does not attempt anything very big, and thus achieves greatness."
    "When people see some things as beautiful, other things become ugly."
    "Nothing in the world is softer than water, yet nothing is better at overcoming the hard and strong."
    "The sage stays behind, thus he is ahead."
    "Be like water making its way through cracks."
    "The wise find pleasure in water; the virtuous find pleasure in hills."
    "When you realize there is nothing lacking, the whole world belongs to you."]
   
   :gospel [
    "In the beginning was the Word, and the Word was with God, and the Word was God."
    "You are the light of the world. A city built on a hill cannot be hidden."
    "Be still, and know that I am God."
    "Seek and you shall find; knock and the door will be opened."
    "The kingdom of heaven is like a grain of mustard seed."
    "Blessed are the pure in heart, for they will see God."
    "The kingdom of heaven is spread upon the earth, but people do not see it."
    "Before Abraham was, I am."]
   
   :gita [
    "You are what you believe yourself to be."
    "Better to do your own dharma imperfectly than someone else's dharma perfectly."
    "That which pervades the entire body, know it to be indestructible."
    "The wise see that there is action in the midst of inaction and inaction in the midst of action."
    "Whatever you do, do it as an offering to the Divine."
    "Set your heart upon your work but never its reward."
    "The soul is neither born, nor does it die."
    "You have the right to work, but not to the fruits of work."]})

(defn random-quote []
  (let [source (rand-nth [:tao :gospel :gita])
        quote-list (source quotes)]
    (str (rand-nth quote-list) " - " 
         (case source
           :tao "Tao Te Ching (Stephen Mitchell)"
           :gospel "Gospel According to Jesus (Stephen Mitchell)" 
           :gita "Bhagavad Gita (Stephen Mitchell)"))))

(defn generate-article [number title category]
  (let [quote (random-quote)
        warm-emoji (rand-nth ["🌅" "🌸" "🕊️" "🌿" "✨" "🙏" "🧘‍♀️" "🌾" "🏔️" "⛩️"])
        outro-quote (random-quote)]
    (str "# " title " " warm-emoji "\n\n"
         "*\"" quote "\"*\n\n"
         "---\n\n"
         "Beautiful souls, Trish here with you under the vast desert sky. "
         "Today we're exploring " (str/lower-case title) " - another step on our journey "
         "toward building aspiringly-sacred technology that serves all life.\n\n"
         "## The Teaching Unfolds 🌱📖\n\n"
         "*Placeholder for Trish's wisdom - to be expanded with specific content*\n\n"
         "Our ancestors knew that " (str/lower-case (str/replace title #"[^\w\s]" "")) " "
         "is essential for thriving communities. Out here in the high desert, where "
         "our families are building, sharing, dancing, and praying together, we're "
         "learning to apply these ancient principles to our modern digital tools.\n\n"
         "## The Nakshatra Speaks 🌟🔭\n\n"
         "Under the guidance of the stars, we remember that every lesson comes "
         "at the perfect time for our soul's growth. This teaching about " 
         (str/lower-case title) " is arriving exactly when our community needs it most.\n\n"
         "## Your Practice Today 🧘‍♀️🌅\n\n"
         "Take a moment to:\n"
         "1. **Breathe deeply** and connect with the earth beneath your feet\n"
         "2. **Set an intention** for how you'll apply this wisdom\n"
         "3. **Honor your ancestors** who carried similar knowledge\n"
         "4. **Serve your community** through your growing understanding\n\n"
         "## Evening Gratitude 🌅🙏\n\n"
         "*\"" outro-quote "\"*\n\n"
         "As the desert sunset paints our sky tonight, remember that you are part "
         "of an unbroken chain of wisdom keepers. Every insight you gain, every "
         "skill you develop, every moment of clarity you experience - it all serves "
         "the greater good of our community and our planet.\n\n"
         "Rest well, beautiful ones. Tomorrow brings new opportunities to practice "
         "what we've learned together. 🌟💤\n\n"
         "---\n\n"
         "**Navigation**: [← Previous Teaching](TODO) | [Next Teaching →](TODO) | "
         "[Practice Paths →](tutorials/)")))

(defn generate-tutorial [letter title]
  (let [quote (random-quote)
        warm-emoji (rand-nth ["🛤️" "🌊" "🔮" "🌱" "⚡" "🎨" "🧭" "🏮" "🌿" "✨"])
        outro-quote (random-quote)]
    (str "# " title " " warm-emoji "\n\n"
         "*\"" quote "\"*\n\n"
         "---\n\n"
         "Greetings, beautiful practitioners! Trish here, ready to guide you through "
         "this hands-on exploration of " (str/lower-case title) ". This is where "
         "ancient wisdom meets modern practice, where our ancestors' knowledge "
         "comes alive in digital form.\n\n"
         "## The Aspiringly-Sacred Practice 🙏💻\n\n"
         "*Placeholder for specific practice instructions - to be expanded*\n\n"
         "Remember, y'all - this ain't just about learning technical skills. "
         "Every practice we do together is a form of prayer, a way of honoring "
         "the gifts we've been given and the community we're serving.\n\n"
         "## Gentle Instructions 📝✨\n\n"
         "1. **Center yourself** - Take three breaths and feel your connection to the earth\n"
         "2. **Set sacred intention** - Ask how this practice can serve love\n"
         "3. **Practice with presence** - Stay curious and compassionate with yourself\n"
         "4. **Integrate with gratitude** - Honor what you've learned\n"
         "5. **Share with community** - Teach someone else what you've discovered\n\n"
         "## When Things Get Challenging 🌊💪\n\n"
         "Our ancestors faced difficulties with grace and patience. When this practice "
         "gets tough, remember:\n"
         "- **Every mistake is medicine** - It's teaching you something important\n"
         "- **Community supports you** - You're not alone in this learning\n"
         "- **Progress over perfection** - Small steps lead to big transformations\n"
         "- **Trust the process** - Understanding comes in its own time\n\n"
         "## Evening Reflection 🌅🙏\n\n"
         "*\"" outro-quote "\"*\n\n"
         "As the stars emerge over our high desert home tonight, take a moment to "
         "appreciate how far you've come. Every skill you develop, every practice "
         "you complete, every moment of understanding you gain - it all contributes "
         "to the beautiful web of knowledge our community is weaving together.\n\n"
         "May your practice be a blessing to yourself and all beings. 🌟💖\n\n"
         "---\n\n"
         "**Navigation**: [← Previous Practice](TODO) | [Next Practice →](TODO) | "
         "[Back to Foundation](../00_index.md)")))

;; Generate numbered articles (04-99, since we already have 00-03)
(println "Generating main articles...")
(let [all-topics (apply concat (vals teaching-themes))
      needed-topics (take 96 all-topics)] ; 96 more to make 100 total
  (doseq [[i topic] (map-indexed vector needed-topics)]
    (let [number (+ i 4) ; Start from 04
          filename (format "docs/en/%02d_%s.md" 
                          number 
                          (-> topic
                              str/lower-case
                              (str/replace #"[^\w\s]" "")
                              (str/replace #"\s+" "_")))]
      (spit filename (generate-article number topic :main))
      (println "Generated:" filename))))

;; Generate tutorial articles (C-Z, 0-9, since we already have A-B)
(println "\nGenerating tutorial articles...")
(let [letters (concat (map char (range (int \C) (inc (int \Z))))
                     (map str (range 0 10)))
      topics (drop 2 tutorial-topics)] ; Skip A and B which we already have
  (doseq [[letter topic] (map vector letters topics)]
    (let [filename (format "docs/en/tutorials/%s_%s.md"
                          letter
                          (-> topic
                              str/lower-case
                              (str/replace #"[^\w\s]" "")
                              (str/replace #"\s+" "_")))]
      (spit filename (generate-tutorial letter topic))
      (println "Generated:" filename))))

(println "\n🎊 All articles generated! Trish's wisdom is ready to guide the community.")
(println "Total main articles: 100 (00-99)")
(println "Total tutorial articles: 36 (A-Z, 0-9)")
(println "\nRemember to customize each article with specific content!")
