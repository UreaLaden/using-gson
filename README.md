# Using GSON
## Collaborators:
[Joseph Lee](https://github.com/josephlee3454)

[Leaundrae Mckinney](https://github.com/UreaLaden)

# Summary
This application parses a .json file in order to display a random book quote.Addiionally the 
application creates a new json file and appends a random quote.

# How to run

In the terminal run `./gradlew run`

# Test Setup
`Test Random Quote` : Checks to see if each quote is random by instantiating the function twice 
and comparing the output. If the results are different the test passes. 

`GetQuotesFromJSon` - Takes in an empty Array List of Quotes. Reads the input json file of 
quotes then then adds to the array list.
`addToJSON` - Takes as arguments an Array List of Quotes  and a Quote object that is added to 
the Array List. Writes the updated array list to a target json file.
`GetQuoteFromAPI` - Returns a random Quote from `"http://quotes.stormconsultancy.co.uk/popular.json"` 