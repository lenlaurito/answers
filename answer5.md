## Answer5

The main functions for the application would be: user signing up, user logging in, user adding contacts, user deleting 
contacts, user viewing his contact list, user viewing a specific contact, user sending a message to a contact, user viewing 
message history for a contact, user logging out.

  ```java
    User
    -id(primary key): long
    -username (unique): String
    -password: String
    -name: String

    User Contact
    -id (primary key): long
    -user (foreign key to user): User
    -contact (foreign key to user): User

    Conversation
    -id (primary key): long

    User Conversation
    -id (primary key): long
    -conversation (foreign key to conversation): Conversation
    -user (foreign key to user): User

    Message
    -id (primary key): long
    -message: String
    -dateTimeSent: DateTime
    -sender (foreign key to user): User
    -conversation (foreign key to conversation): Conversation
  
  A User can have many Contacts.
  A conversation involves 2 users. (Note: It could potentially involve more than 2 users if the app decides to add a group   message feature)
  A User can take part in many conversations.
  A conversation can have many messages.
  ```

With the application, its certain that there would be a huge amount of messages in the database. For efficiency, we can 
limit the number of messages to be viewed by the user at a time when he views the message history. Also, we could consider 
creating an index to the message table for the message field so that it would be more efficient when searching messages. To optimise data storage, we could also set that messages will be stored in the database as a single record like every minute or x seconds. for  For the contacts, we could also consider creating an index for the user field so that it would be 
faster when getting the contact list for the user.
