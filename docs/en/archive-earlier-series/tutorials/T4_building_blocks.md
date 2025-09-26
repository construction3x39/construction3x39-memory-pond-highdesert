# T4: Building Blocks

*"Small pieces, loosely joined, building something greater"*

## What are Building Blocks?

Building blocks are small, simple pieces that we can combine to make bigger, more complex things. It's like LEGO - each piece is simple, but together they can build amazing creations.

## The Magic of Functions

Functions are the building blocks of programming. They take some input, do something with it, and give you back a result.

```clojure
; A simple building block
(defn add-one [number]
  (+ number 1))

; Using our building block
(add-one 5)  ; => 6
(add-one 10) ; => 11
```

## Combining Building Blocks

The real magic happens when we combine simple building blocks:

```clojure
; Small building blocks
(defn add-one [x] (+ x 1))
(defn multiply-by-two [x] (* x 2))
(defn subtract-five [x] (- x 5))

; Combining them
(defn my-calculation [x]
  (-> x
      add-one
      multiply-by-two
      subtract-five))

(my-calculation 3) ; => 3
; Step by step: 3 → 4 → 8 → 3
```

## Why Building Blocks Matter

Building blocks help us:
- **Start Simple**: Begin with easy pieces
- **Build Up**: Combine simple things into complex ones
- **Reuse**: Use the same block in many places
- **Understand**: Each piece has one clear purpose

## The LEGO Principle

Just like LEGO:
- Each piece does one thing well
- Pieces connect in standard ways
- You can build anything with enough pieces
- You can take apart and rebuild

## The Path to Systems

Building blocks teach us how complex systems work:
- Cities are built from buildings
- Buildings are built from rooms
- Rooms are built from walls
- Walls are built from bricks

**From simple functions to complex systems** - this is the way.