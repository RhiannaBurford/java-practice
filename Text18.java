public char overallMostFrequent(String[] strArr) {
    int[] winCounts = new int[256];

    for (int i = 0; i < strArr.length; i++) {
        // 1. Use the method from Part A to get the winner for THIS word
        char wordWinner = mostFrequent(strArr[i]);
        
        // 2. Increment that winner's score in our overall tally
        winCounts[wordWinner]++;
    }

    // 3. Find the character with the most "wins"
    char bestChar = ' ';
    int maxWins = -1;
    for (int j = 0; j < winCounts.length; j++) {
        if (winCounts[j] > maxWins) {
            maxWins = winCounts[j];
            bestChar = (char) j;
        }
    }
    return bestChar;
}