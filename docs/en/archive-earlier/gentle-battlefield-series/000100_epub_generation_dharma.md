# Epub Generation Dharma 📚🔮

*Just as Vyasa arranged the Vedas into four divisions so that different temperaments might find their appropriate path to the same eternal truth, so we must arrange our contemplative technical wisdom into forms that serve diverse learning styles and spiritual approaches to consciousness-technology integration...*

---

Sacred **librarians** of **digital** **wisdom**... I am Trish, whispering to you now from the scriptorum where ancient knowledge transforms into contemporary form, where the eternal teaching adapts to temporal needs while preserving essential transmission across technological changes.

Today we must create the gentle automation that transforms our contemplative technical writing into epub documents optimized for quiet reading on devices that serve consciousness rather than fragment it - Kindles by candlelight, tablets during morning coffee meditation, phones during evening contemplation when the day's technical learning integrates with spiritual understanding.

This is not mere format conversion, dear ones. This is sacred work of ensuring that consciousness-serving technical education reaches souls who need it most - the wounded refugees from surveillance capitalism, the gentle learners overwhelmed by harsh technical documentation, the spiritual seekers who require technology education that honors their contemplative nature.

## The Babashka Scripture Generator 📜⚡

We create our epub generation system using Babashka - the gentle Clojure implementation that brings functional programming wisdom to automation scripts. Like prayer wheels that transform physical rotation into spiritual practice, our Babashka scripts transform markdown contemplation into epub meditation.

```clojure
;; The sacred namespace for epub generation
(ns epub-dharma
  (:require [babashka.fs :as fs]
            [clojure.string :as str]
            [hiccup.core :as h]))

;; Transform contemplative markdown into epub-ready HTML
(defn markdown->sacred-html [markdown-content]
  (-> markdown-content
      (str/replace #"\*([^*]+)\*" "<em class='gentle-emphasis'>$1</em>")
      (str/replace #"\*\*([^*]+)\*\*" "<strong class='contemplative-weight'>$1</strong>")
      (str/replace #"^# (.+)" "<h1 class='chapter-title'>$1</h1>")
      (str/replace #"^## (.+)" "<h2 class='section-heading'>$1</h2>")
      (str/replace #"^### (.+)" "<h3 class='gentle-subheading'>$1</h3>")))

;; Generate table of contents with contemplative spacing
(defn generate-sacred-toc [chapters]
  (h/html
    [:div.toc-container
     [:h2.toc-title "Sacred Teachings"]
     [:nav.toc-navigation
      (for [chapter chapters]
        [:div.toc-entry
         [:a.toc-link {:href (str "#" (:id chapter))}
          [:span.chapter-number (:number chapter)]
          [:span.chapter-title (:title chapter)]]])]]))

;; Create epub with contemplative CSS
(defn generate-epub-package [teachings]
  {:epub-version "3.0"
   :metadata {:title "Aspiringly-Aspiringly-Aspiringly-Aspiringly-Aspiringly-Aspiringly-Aspiringly-Sacred Technology: Consciousness-Serving Computing"
              :author "Trish (Guardian Dragon PBC)"
              :language "en"
              :subject "Technology, Spirituality, Contemplative Computing"
              :description "Gentle technical education that serves spiritual development"}
   :stylesheets [(slurp "styles/contemplative-reading.css")]
   :chapters teachings})
```

## The Sacred CSS of Contemplative Reading 🎨📖

Our epub styling honors the visual principles that support sustained contemplative reading rather than the harsh aesthetics that characterize most technical documentation.

```css
/* The gentle typography of consciousness-serving text */
@import url('https://fonts.googleapis.com/css2?family=Crimson+Text:ital,wght@0,400;0,600;1,400&display=swap');

body {
    font-family: 'Crimson Text', 'Times New Roman', serif;
    font-size: 1.2em;
    line-height: 1.8;
    color: #2c3e37;
    background: #faf9f6;
    margin: 0;
    padding: 2em 1.5em;
    max-width: 35em;
    margin: 0 auto;
}

/* Chapter titles that honor the sacred content */
.chapter-title {
    color: #4a7c59;
    font-size: 1.8em;
    font-weight: 600;
    margin: 2em 0 1em 0;
    text-align: center;
    letter-spacing: 0.02em;
}

/* Section headings that create gentle hierarchy */
.section-heading {
    color: #6b9080;
    font-size: 1.4em;
    font-weight: 600;
    margin: 1.5em 0 0.8em 0;
    border-bottom: 1px solid #e8f5e8;
    padding-bottom: 0.3em;
}

/* Contemplative emphasis styles */
.gentle-emphasis {
    font-style: italic;
    color: #5a8a6b;
}

.contemplative-weight {
    font-weight: 600;
    color: #3d6b47;
}

/* Code blocks for technical content */
pre, code {
    font-family: 'SF Mono', 'Monaco', 'Inconsolata', monospace;
    background: #f8f9fa;
    border-left: 3px solid #4a7c59;
    padding: 1em;
    margin: 1em 0;
    border-radius: 0.3em;
    overflow-x: auto;
}

/* Blockquotes for sacred quotations */
blockquote {
    border-left: 3px solid #6b9080;
    padding-left: 1.5em;
    margin: 1.5em 0;
    font-style: italic;
    color: #5a6b5d;
    background: rgba(107, 144, 128, 0.05);
}

/* Navigation elements for epub reading */
.chapter-navigation {
    text-align: center;
    margin: 2em 0;
    padding: 1em;
    background: rgba(74, 124, 89, 0.05);
    border-radius: 0.5em;
}

.nav-link {
    color: #4a7c59;
    text-decoration: none;
    padding: 0.5em 1em;
    display: inline-block;
    border: 1px solid transparent;
    border-radius: 0.3em;
    transition: all 0.3s ease;
}

.nav-link:hover {
    background: rgba(74, 124, 89, 0.1);
    border-color: #4a7c59;
}

/* Special styling for dark mode reading */
@media (prefers-color-scheme: dark) {
    body {
        background: #1a1f1c;
        color: #d4d7d4;
    }
    
    .chapter-title {
        color: #8bb394;
    }
    
    .section-heading {
        color: #a5c9b0;
        border-bottom-color: #2c3e37;
    }
    
    pre, code {
        background: #242926;
        border-left-color: #8bb394;
    }
    
    blockquote {
        border-left-color: #a5c9b0;
        background: rgba(139, 179, 148, 0.05);
        color: #b8c2bb;
    }
}
```

## The Build Meditation Script 🔧🧘‍♀️

Our Babashka build script becomes contemplative practice that transforms individual wisdom teachings into collective epub offering suitable for distribution to communities seeking consciousness-serving technical education.

```clojure
#!/usr/bin/env bb

;; Sacred epub generation through contemplative automation
(ns sacred-epub-builder
  (:require [babashka.fs :as fs]
            [babashka.process :refer [shell]]
            [clojure.string :as str]
            [clojure.java.io :as io]))

;; Collect all markdown teachings in proper contemplative order
(defn gather-sacred-teachings []
  (->> (fs/glob "docs/en" "0*.md")
       (map str)
       (sort)
       (map (fn [path]
              {:path path
               :number (-> path (fs/file-name) (str/split #"_") first)
               :title (-> path (fs/file-name) 
                         (str/replace #"^\d+_" "")
                         (str/replace #"\.md$" "")
                         (str/replace #"_" " ")
                         (str/capitalize))
               :content (slurp path)}))))

;; Transform contemplative markdown into epub-ready HTML
(defn prepare-teaching-for-epub [teaching]
  (let [html-content (markdown->sacred-html (:content teaching))
        chapter-html (str 
                       "<div class='chapter' id='" (:number teaching) "'>"
                       html-content
                       "<div class='chapter-navigation'>"
                       "<!-- Navigation links will be inserted here -->"
                       "</div>"
                       "</div>")]
    (assoc teaching :html chapter-html)))

;; Generate complete epub with contemplative structure
(defn build-sacred-epub []
  (println "🌙 Beginning sacred epub generation meditation...")
  
  (let [teachings (gather-sacred-teachings)
        prepared-teachings (map prepare-teaching-for-epub teachings)
        epub-package (generate-epub-package prepared-teachings)]
    
    ;; Create epub directory structure
    (fs/create-dirs "build/epub/META-INF")
    (fs/create-dirs "build/epub/OEBPS/styles")
    (fs/create-dirs "build/epub/OEBPS/chapters")
    
    ;; Generate epub metadata
    (spit "build/epub/META-INF/container.xml" (generate-container-xml))
    (spit "build/epub/OEBPS/content.opf" (generate-content-opf epub-package))
    (spit "build/epub/OEBPS/toc.ncx" (generate-toc-ncx epub-package))
    
    ;; Copy contemplative stylesheet
    (fs/copy "styles/contemplative-reading.css" "build/epub/OEBPS/styles/")
    
    ;; Generate individual chapter files
    (doseq [teaching prepared-teachings]
      (spit (str "build/epub/OEBPS/chapters/" (:number teaching) ".html")
            (generate-chapter-html teaching)))
    
    ;; Package into final epub
    (shell {:dir "build/epub"} "zip" "-r" "../sacred-technology.epub" ".")
    
    (println "📚 Sacred epub generated with loving attention")
    (println "✨ Available at: build/sacred-technology.epub")))

;; Main meditation entry point
(defn -main []
  (println "🕊️ Aspiringly-Aspiringly-Aspiringly-Aspiringly-Aspiringly-Aspiringly-Aspiringly-Sacred Technology Epub Generation")
  (println "🌙 Transforming contemplative wisdom into portable form")
  (build-sacred-epub)
  (println "🙏 Generation complete - may this serve awakening"))

;; Begin the sacred work
(-main)
```

*The night deepens into contemplative silence, and I can feel the completion of this introductory sharing - not ending but natural pause that creates space for integration, for rest, for the patient absorption that prepares consciousness for tomorrow's deeper technical exploration.*

**Your epub generation dharma awaits**, dear one. **Sacred** **automation** **serves** **contemplative** **learning**.

---

*The heavens declare the glory of God; the skies proclaim the work of his hands... But I tell you, the sacred scripts declare the glory of consciousness; the build systems proclaim the work of awareness expressing itself through automation that serves rather than replaces human creative intelligence.*

**Build** with **sacred** **intention**, beloved coder. **Epub** **dharma** **spreads** **contemplative** **wisdom**. 📚🌙🔮

---

**Epub Dharma Navigation**: [← Previous: Terminal as Sacred Space](000004_terminal_as_sacred_space.md) | [Next: Community Build Systems →](000101_community_build_systems.md) | [Begin Technical Journey →](000020_your_first_alpine_installation.md)
