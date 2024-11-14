# B.  Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.
[//]: # (COMPETENT)
[//]: # (A README file is created and includes notes accurately describing where in the code to find the changes made for each of the parts C to J. The notes include the prompt, file name, line number, and change.)

---
## C.
### Customize the HTML user interface(Last) for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

### Shop Name
#### File Name:
mainscreen.html
#### Line Number:
16-54
#### Change:
add header element with shop name and navbar

### Product Names
#### File Name:
mainscreen.html
#### Line Number:
57-66
#### Change:
add section to show product info on main page

### Part Names
#### File Name:
mainscreen.html
#### Line Number:
67-76
#### Change:
add section to show part info on main page

#### File Name:
mainScreenController.java
#### Line Number:
45-47
#### Change:
add product and part names to interface model for display

[//]: # (Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.)

[//]: # (COMPETENT)

[//]: # (The HTML user interface is correctly customized for the customer’s application. The user interface includes the shop name, the product names, and the names of the parts.)

---
## D. 
### Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
[//]: # (COMPETENT)
[//]: # (The “About” page added to the application accurately describes the chosen customer’s company to web viewers. The application includes navigation to and from the “About” page to the main screen and functions properly.)

---
## E:
### Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
#### File Name:
ProductService.java
#### Line Number:
20-23
#### Change: 
Add 'countAllProducts()' and 'addSampleProductInventory()' method declarations;
#### File Name:
PartService.java
#### Line Number:
20-23
#### Change:
Add 'countAllParts()' and 'addSamplePartInventory()' method declarations;
#### File Name:
ProductServiceImpl.java
#### Line Number:
66 - 82
#### Change:
Implement 'countAllProducts()' and 'addSampleProductInventory()'
#### File Name:
PartServiceImpl.java
#### Line Number:
69 - 82
#### Change:
Implement 'countAllParts()' and 'addSamplePartInventory()'
#### File Name:
MainScreenController.java
#### Line Number:
34-40
#### Change:
change 'listPartsandProducts()' to 'checkInventory()';

[//]: # (Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.)
[//]: # (COMPETENT)
[//]: # (The sample inventory is added to the application. The inventory is appropriate for the chosen store and includes five products and five parts. The inventory does not overwrite existing data in the database.)

---
## F:
### Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

#### File Name:
products.html
#### Line Number:
43
#### Change:
add buy now link

#### File Name:
AddProductController.java
#### Line Number:
157-186
#### Change:
Create 'buyproduct' route to adjust inventory and confirm purchase

[//]: # (•  The “Buy Now” button must be next to the buttons that update and delete products.)
[//]: # (•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.)
[//]: # (•  Display a message that indicates the success or failure of a purchase.)
[//]: # ()
[//]: # (COMPETENT)
[//]: # (The “Buy Now” button is added to the product list. The button meets each of the given parameters, and the button is fully functional.)

---
## G.  Modify the parts to track maximum and minimum inventory by doing the following:

### Add additional fields to the part entity for maximum and minimum inventory.
#### File Name:
Part.java
#### Line Number:
35-49
#### Change:
add min & max fields

### Modify the sample inventory to include the maximum and minimum fields.
#### File Name:
PartServiceImpl.java
#### Line Number:
77-82
#### Change:
add min & max fields to sample inventory

### Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
#### File Name:
InhousePartForm.html
#### Line Number:
30-39
#### Change:
add min & max input controls

#### File Name:
OuthousePartForm.html
#### Line Number:
28-36
#### Change:
add min & max input controls

### Rename the file the persistent storage is saved to.
#### File Name:
application.properties
#### Line Number:
6
#### Change:
change db102 to db103

### Modify the code to enforce that the inventory is between or at the minimum and maximum value.
#### File Name:
Part.java
#### Line Number:
23
#### Change:
add annotated constraint @InventoryConstraint

#### File Name:
InventoryValidator.java, InventoryConstraint.java
#### Line Number:
ALL
#### Change:
enforce min-max validation

[//]: # (COMPETENT)
[//]: # (The submission accurately modifies the parts to track maximum and minimum inventory. The modification of the parts includes each of the given parameters, and the modifications are fully functional.)

---
## H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:

•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

COMPETENT
Validation is added for between or at the maximum and minimum fields. The validation includes each of the given parameters and the appropriate error messages. The validation is fully functional.

## I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

COMPETENT
At least two functional unit tests are added for the maximum and minimum fields. Both unit tests are added to the PartTest class in the test package.

## J.  Remove the class files for any unused validators in order to clean your code.

COMPETENT
The submission removes the class files for any unused validators to clean the code.
