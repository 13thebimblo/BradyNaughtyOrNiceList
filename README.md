# **Naughty or Nice List**
### **Setup**
1. **Create 2D String array "list"**
2. **Create 1D String array "input"**
3. **Create String variable "confirmation**
4. **Format list**
    1. All caps
    2. Green if nice
    3. Yellow if unknown
    4. Red if naughty
        1. Changes gifts to coal
5. **Use Scanner to do initial prompt for whether you want to add info**
    1. Takes in any caps variation of "yes" or "no"
### **Main loop**
1. **"yes"**
    1. Prompts for info
        1. Put into array input
    2. Updates list
        1. Puts input into available row
            1. Ends code if no rows are available
    3. Prints newly updated list
    4. Prompts again for whether you want to add more info
    5. Loops
2. **"no"**
    1. Ends code and breaks loop
