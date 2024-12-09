This is my Book Sorter program. 

This program will simulate a library's book management system by implementing
custom sorting features using the Comparator interface. This will involve the ability
to create several comparators to sort books by title, author, and the year of publication. As
well as a combined sort order for more refined searches.

There is a Book class that will allow you to add books (Title, Author, Year). 
There is a Book Catelogue class will allow you to display the books in the catelogue by
title order, author order, or by year order. 
We also have a seperate Comparator class for each type of sort (TitleComparator, AuthorComparator,
and YearComparator).

In order to run this program go over to the Main class and first create a selection of 
books. Then create a new BookCatelogue and add those books to it. You will then use 
System.out.println and choose to display the catelogue either by the title order, author order,
or by the year order. If you do not specify it will always display the list in its current order.