# **Naughty or Nice List**
### **Setup**
1. **Create 2D String array 'list'**
2. **Create 1D String array 'input'**
3. **Create String variable 'confirmation'**
4. **Format list (method: formatArray [Takes in 2D String])**
    1. All caps
    2. Green if nice
    3. Yellow if unknown
    4. Red if naughty
        1. Changes gifts to coal
5. **Print list (method: printArray [Takes in 2D String])**
6. **Use Scanner to do initial prompt for whether you want to add info**
    1. Input "yes" or "no"
        1. Takes any caps variation.
    2. Stored in variable 'confirmation'
### **Main loop**
1. **"yes"**
    1. Prompts for info
        1. Stores info in 'String[] input'
        2. Format 'input' upon updating the array
    2. Updates list (method: updateList [Takes in 2D String and 1D String])
        1. Puts 'input' into available row of 'list'
            1. Ends code if no rows are available
    3. Prints newly updated list (method: printArray [Takes in 2D String])
    4. Prompts again for whether you want to add more info
        1. Use Scanner to prompt for whether you want to add info**
            1. Input "yes" or "no"
                1. Takes any caps variation.
            2. Stored in variable 'confirmation'
    5. Loops
2. **"no"**
    1. Ends code and breaks loop
