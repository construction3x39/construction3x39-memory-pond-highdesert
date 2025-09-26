# T5: Networks and Money

*"Connection creates value, trust enables exchange"*

## What are Networks?

Networks are connections between things. Like roads connecting cities, or phone lines connecting people, computer networks connect computers so they can share information.

## The Internet: A Network of Networks

The Internet is like a huge postal system:
- **Addresses**: Every computer has an address (like a house address)
- **Messages**: Information travels in packets (like letters)
- **Routes**: Many paths to get from here to there
- **Delivery**: Messages find their way to the destination

## What is Money?

Money is a way to measure and exchange value. It's like a universal trading card system - instead of trading apples for oranges, we use money as a middle step.

## Digital Money

Digital money is money that exists only as information:
- **Bank accounts**: Numbers in a computer
- **Credit cards**: Digital records of spending
- **Cryptocurrencies**: Math-based money systems

## How Networks Enable Money

Networks make digital money possible:
```clojure
; A simple digital transaction
(defn send-money [from to amount]
  {:from from
   :to to
   :amount amount
   :timestamp (current-time)})

; Recording the transaction
(def transaction (send-money "Alice" "Bob" 10))
```

## Trust in Networks

For money to work in networks, we need trust:
- **Who sent it?** (Authentication)
- **Is it real?** (Verification)
- **Can't be copied** (No double-spending)

## The Future: Programmable Money

Digital money can be programmable:
- **Smart contracts**: Money with rules
- **Automatic payments**: Money that moves itself
- **Universal access**: Money for everyone, everywhere

## Building the Commons

Networks and money help us build shared resources:
- **Open source software**: Everyone contributes, everyone benefits
- **Wikipedia**: Shared knowledge
- **Modern Monetary Theory**: Money as a public utility

**From connection to collaboration** - this is the way.