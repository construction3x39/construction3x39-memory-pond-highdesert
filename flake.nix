{
  description = "🌙 Aspiringly-Sacred Technology - Complete Development Environment";
  inputs = { 
    nixpkgs.url = "github:NixOS/nixpkgs/nixos-unstable"; 
    flake-utils.url = "github:numtide/flake-utils";
  };
  outputs = { self, nixpkgs, flake-utils }:
    flake-utils.lib.eachDefaultSystem (system:
      let pkgs = nixpkgs.legacyPackages.${system};
      in {
        devShells.default = pkgs.mkShell {
          buildInputs = with pkgs; [
            # 🌙 Core Aspiringly-Sacred Development
            babashka clojure leiningen jdk17 git
            # 📚 Professional Publishing Pipeline  
            pandoc calibre texlive.combined.scheme-full
            python3 python3Packages.pygments python3Packages.markdown
            # ✨ Revolutionary Editor System
            neovim lua luajit tree-sitter
            # 🎨 Code Quality & Formatting
            zprint clj-kondo
            # 🌐 Web Development & Community
            nodejs_20 httpie
            # 🔐 Security Foundation
            gnupg openssh
            # 🏗️ Build Infrastructure
            gnumake gcc pkg-config
            # 📖 Documentation Enhancement
            graphviz imagemagick librsvg
          ];
          shellHook = ''
            echo "🌙 Aspiringly-Sacred Technology Development Environment"
            echo "✨ Complete toolchain for awareness-serving development"
            echo ""
            echo "Available commands:"
            echo "  bb doctor    - Check complete toolchain health"
            echo "  bb test:all  - Run comprehensive testing"
            echo "  bb build:all - Complete build pipeline"
            echo "  bb fmt       - Format with contemplative attention"
            echo ""
            echo "🎯 Ready for aspiringly-sacred development!"
          '';
        };
      });
}
