
## C.
### Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

### Shop Name
#### File Name:
home.html
#### Line Number:
16-54
#### Change:
add header element with shop name and navbar

<br>

### Product Names
#### File Name:
home.html
#### Line Number:
57-77
#### Change:
add section to show product info on main page

<br>

### Part Names
#### File Name:
home.html
#### Line Number:
67-76
#### Change:
add section to show part info on main page

<br>

#### File Name:
homeController.java
#### Line Number:
35-36
#### Change:
add product and part names to interface model for display


## D:
### Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
#### File Name:
AboutPageController.java
#### Line Number:
ALL
#### Change:
create route to about page

<br>

#### File Name:
about.html
#### Line Number:
ALL
#### Change:
create about page.html


## E:
### Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
#### File Name:
ProductService.java
#### Line Number:
20-21
#### Change: 
Add 'countAllProducts()' and 'addSampleProductInventory()' method declarations;

<br>

#### File Name:
PartService.java
#### Line Number:
20-21
#### Change:
Add 'countAllParts()' and 'addSamplePartInventory()' method declarations;

<br>

#### File Name:
ProductServiceImpl.java
#### Line Number:
64 - 79
#### Change:
Implement 'countAllProducts()' and 'addSampleProductInventory()'

<br>

#### File Name:
PartServiceImpl.java
#### Line Number:
67 - 82
#### Change:
Implement 'countAllParts()' and 'addSamplePartInventory()'

<br>

#### File Name:
homeController.java
#### Line Number:
25-32
#### Change:
change 'listPartsandProducts()' to 'checkInventory()';



## F:
### Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

#### File Name:
products.html
#### Line Number:
43
#### Change:
add buy now link

<br>

#### File Name:
AddProductController.java
#### Line Number:
166-175
#### Change:
Create 'buyproduct' route to adjust inventory and confirm purchase


## G:
### Modify the parts to track maximum and minimum inventory by doing the following:

### Add additional fields to the part entity for maximum and minimum inventory.
#### File Name:
Part.java
#### Line Number:
33-38
#### Change:
add min & max fields

<br>

### Modify the sample inventory to include the maximum and minimum fields.
#### File Name:
PartServiceImpl.java
#### Line Number:
72-82
#### Change:
add min & max fields to sample inventory

<br>

### Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
#### File Name:
InhousePartForm.html
#### Line Number:
30-39
#### Change:
add min & max input controls

<br>

#### File Name:
OutsourcePartForm.html
#### Line Number:
28-36
#### Change:
add min & max input controls

<br>

### Rename the file the persistent storage is saved to.
#### File Name:
application.properties
#### Line Number:
6
#### Change:
change db102 to db103

<br>

### Modify the code to enforce that the inventory is between or at the minimum and maximum value.
#### File Name:
Part.java
#### Line Number:
21
#### Change:
add annotated constraint @InventoryConstraint

<br>

#### File Name:
InventoryValidator.java, InventoryConstraint.java
#### Line Number:
ALL
#### Change:
enforce min-max validation


## H:
### Add validation for between or at the maximum and minimum fields. The validation must include the following:
#### Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
#### File Name:
Part.java
#### Line Number:
23
#### Change:
add annotated constraint @InventoryConstraint

<br>

#### Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
#### File Name:
EnufPartsValidator.java
#### Line Number:
33,35,36-38
#### Change:
change condition to ensure product update doesnt lower parts below minInv instead of partInv

<br>

#### Display error messages when adding and updating parts if the inventory is greater than the maximum.
#### File Name:
Part.java
#### Line Number:
23
#### Change:
add annotated constraint @InventoryConstraint

<br>

#### File Name:
InventoryValidator.java, InventoryConstraint.java
#### Line Number:
ALL
#### Change:
enforce min-max validation


## I:
### Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
#### File Name:
PartTest.java
#### Line Number:
160-175
#### Change:
add  tests 'setMinInv' and 'setMaxInv'

<br>

#### File Name:
InventoryValidatorTest.java
#### Line Number:
ALL
#### Change:
add  tests 'testInventoryInvalidAboveMax', 'testInventoryInvalidBelowMin', 'testInventoryBetweenMinimumAndmaximum'


## J:
### Remove the class files for any unused validators in order to clean your code.

#### File Name:
DeletePartValidator.java
ValidDeletePart.java
#### Change:
removed unused validators

