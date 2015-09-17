## Answer5

The main functions for the application would be: user signing up, user logging in, user adding contacts, user deleting 
contacts, user viewing his contact list, user viewing a specific contact, user sending a message to a contact, user viewing 
message history for a contact, user logging out.

Models for the application:

  ```markdown
    User
    -id(primary key): long
    -username (unique): String
    -password: String
    -name: String

    User Contact
    -id (primary key): long
    -user (foreign key to user): User
    -contact (foreign key to user): User

    Message
    -id (primary key): long
    -message: String
    -dateTimeSent: DateTime
    -sender (foreign key to user): User
    -recepient (foreign key to user): User
  
  A User can have many Contacts.
  A User can send and receive many messages to and from its Contacts.
  ```

With the application, its certain that there would be a huge amount of messages in the database. For efficiency, we can 
limit the number of messages to be viewed by the user at a time when he views the message history. Also, we could consinder 
creating an index for the message table for the sender and recepient fields so that it would be more efficient when showing 
and searching messages. For the contacts, we could also consider creating an index for the user field so that it would be 
faster when getting the contact list for the user.
