# LOOPah — Intelligent Infinite Audio Looper

**LOOPah** is a modern, web-based audio practice and analysis application designed for musicians, vocalists, language learners, and audio editors. Built with a minimalist, high-performance user interface, it allows users to break down complex audio tracks, isolate specific layers, and manage multiple practice zones simultaneously.

The core philosophy behind LOOPah is represented by its branding: a seamless marriage between the infinity symbol (∞) and dynamic musical notation, symbolizing endless fluid playback and targeted repetition.

---

## 🚀 Key Features

* **Multi-Set Loop Management:** Unlike traditional audio players that only support a single A-B loop, LOOPah lets you save, name, and categorize multiple independent loop segments. Perfect for dividing a song into individual verses, choruses, or complex solo sections.
* **Integrated Lyrics & Note Pad:** Track context matters. Each saved loop set features a dedicated workspace to attach text—such as lyric segments, pronunciation guides, chord structures, or production reminders—that stays synced with that boundary region.
* **Advanced Audio Stems Separation:** Powered by a clean tri-channel audio routing matrix, users can shift fluidly between the **Full Mix**, a high-pass filtered **Vocal Isolation** mode, and a low-pass filtered **Instrumental Separation** mode. A dedicated separation density slider lets you fine-tune the filter focus.
* **Precision Visual Waveform & Timeline Zoom:** Features a dynamic, custom-rendered canvas waveform. Users can smoothly scale timeline zoom up to 1200% to pin precision markers and catch exact sample boundaries without losing their orientation.
* **Adaptive Theme System:** Built with a dark theme default and smooth CSS variables, the interface instantly flips to a high-contrast light layout at the press of a single toggle, completely re-rendering timeline details dynamically.
* **Persistent Project States:** Features instant state export and import using localized JSON schemas. Save your custom markers, fine-tuned loop regions, notes, and player configurations to your device and resume practice right where you left off.
* **Cross-Platform Ready:** Engineered using raw, optimized vanilla JavaScript and clean semantic layout design, the platform is structured for flawless performance on both desktop browsers and mobile webview wraps (such as Apache Cordova or Ionic Capacitor).

---

## 🛠️ Technical Architecture

* **Frontend Interface:** Semantic HTML5, customized responsive layout grids, CSS Custom Properties (Variables) for lightweight theme management, and Fluent Typography scaling (`clamp`).
* **Audio Engine:** HTML5 `Audio()` API connected to a custom **Web Audio API** routing graph featuring node configurations for `MediaElementAudioSourceNode`, independent `GainNode` channel levels, and customized high-pass/low-pass `BiquadFilterNode` configurations.
* **Waveform Engine:** High-performance HTML5 `<canvas>` rendering matrix that decodes raw audio sample buffers to plot proportional positive and negative amplitude curves.
* **State Persistence:** Structured JSON serialization algorithms handling client-side `Blob` downloads for standard web users alongside integrated native `Filesystem` hooks for hybrid platform environments.

---

## 📂 Target Audience

* **Musicians & Vocalists:** To isolate difficult song movements, slow down playback speed without changing pitch, and loop sections until they build perfect muscle memory.
* **Language Learners & Transcriptionists:** To separate high-frequency speech stems, slow down rapid dialog, and pin inline translations or transcripts directly underneath targeted audio frames.
* **Content Creators & Sound Designers:** To visually scan audio properties, flag region timestamps via markers, and map out timing schemas for editing projects.
