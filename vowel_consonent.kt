fun main() 
{
    print("Enter a character: ")
    val input = readLine()  // Read user input as a string

    if (input != null && input.isNotEmpty()) 
    {
        val ch = input[0]  //Take the first character of the input
        val character = ch.lowercaseChar()  // Convert to lowercase for uniform checking

        val result = when (character) 
        {
            'a', 'e', 'i', 'o', 'u' -> "vowel"
            else -> "consonant"
        }
        println("$ch is $result")
    } else 
    {
        println("No input provided.")
    }
}
 
