## Answer 1 - String Reverser
>I'm wondering if it's possible to go even a step further in simplifying it though, possibly by using toCharArray() instead of calling charAt(). What do you think? What would that look like?

```java
public String reverse(String s) {
    char[] charArray =  s.toCharArray();
    int length = charArray.length;

    for(int i = 0; i < length/2; i++) {
        char temp = charArray[i];
        charArray[i] = (charArray[length - i - 1]);
        charArray[length - i - 1] = temp;
    }

    return new String(charArray);
}
```

I updated the reverse method to use `toCharArray()` and by doing so, I realized that we could update the logic so that the loop would only be performed (strLength/2) times. This would be done by switching the characters in the character array as shown above.

## Answer 2 - Multiplication Table
>Is there a way to achieve the same result without using a tab character?
In the sample output from the question the numbers are right-aligned. What would be a simple way of achieving that?

```java 
public void printMultiplicationTable(int size) {
    for(int i = 1; i <= size; i++) {
        for(int j = 1; j <= size; j++) {
            System.out.printf("%4d", i*j);
        }

        //Print new line
        System.out.println("");
    }
}
```
I removed the tab character and used 'printf()' to format the output to be right-aligned.

## Answer 3 - TacoCat
>Very nice. I like your use of extracting non-obvious logic into methods.

Thanks :)

## Answer 4 - Dice Probability
>This is really clever. Would you mind explaining your thinking behind it for me?

Thanks. I actually quite enjoyed coming up with a solution for this one. When I was trying to figure out how to create the method, I knew that we would have to compute for the probabilty by dividing the number of possibile combinations to get the particular number by the total number of combinations. Since there are 6 sides to a die and there are 2 dice, the total number of combinations is 6*6 which is 36. The tricky part is getting the number possible combinations for a particular number. I started by listing the number of combinations. From there I noticed a kind of pattern wherein the number of possible combinations goes up to 6 then goes back down to 1. Then, I created a logic for this pattern.

>Just noting there's also an off-by-one error in the input check that returns 0. If you pass in 0 as the input, it will make it past that range check and result in a probability of -0.028 instead of 0. All good though :)

```java
public double getProbability(int i) {
    if(i > 12 || i <= 0) {
        return 0;
    }
    ...
}
```
Sorry, I missed 0 in the input check. I've added it to the condition as seen above :)

## Answer 5 - Skype clone
>What kind of index would we need to add here? Would you be able to give an example SQL snippet using either Postgres or Oracle?

I'm not really an expert on indexing so I did a bit of research on this and I think a full-text index could be used in this case since we're searching for certain keywords on texts. I found out that on psql, we could create a full-text index using: create index fs_idx on message using gin(to_tsvector('english', message));

(Regarding optimization of database storage)
>Would you be able to explain this in a bit more detail?

I was thinking that messages would only be saved into the database every x seconds if it comes from the same user. When a user sends a message and within x seconds, the user sends a couple more messages without the other user sending any message, then those messages will only be stored as one record.

>Are there any other indexes we'd want to add to this schema, or does that just about cover it?

I think we could also add indices for the user field on the user conversation table and the conversation and dateTimeSent fields on the message table.



