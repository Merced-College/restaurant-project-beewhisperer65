// Name: Pranav Senthil Vadivel
// Date: 07/16/2026
// File Name: Ingredient.java
// Description: Creating a class called ingredients to tell java all the ingredients needed for each menu item in the restaurant

//The Ingredient class represents the one ingredient used in a menu item
public class Ingredient{

    // Instance Variables: Store information about the one ingredient (name, allergen, allergen type)
    private String name;
    private boolean allergen;
    private String allergenType;

    public Ingredient()
    {

    }

    // Parameteized constructor with no allergy type
    public Ingredient(String name, boolean allergen)
    {
        this.name = name;
        this.allergen = allergen;
    }
    
    // Parameteized constructor initializes all Ingredient information
    public Ingredient(String name, boolean allergen, String allergenType)
    {
        this.name = name;
        this.allergen = allergen;
        this.allergenType = allergenType;
    }

    // Returns the ingredient name
    public String getName()
    {
        return name;
    }

    // Updates the ingredient name
    public void setName(String name)
    {
        this.name = name;
    }
    
    // Returns true if the ingredient is an Aallergen
    public boolean isAllergen()
    {
        return allergen;
    }

    // Updates whether the ingredient is an allergen
    public void setAllergen(boolean value)
    {
        this.allergen = value;
    }

    // Returns the allergen type
    public String getAllergenType()
    {
        return allergenType;
    }

    // Updates the allergen type
    public void setAllergenType(String type)
    {
        this.allergenType = type;
    }

    // Returns a formatted String describing the ingredient
    @Override 
    public String toString() {
        if (allergen) {
            return "Ingredient {name " + name + ", is allergen? = " + allergen + " allergen type = " + allergenType + "}";
        }
        else {
            return "Ingredient {name " + name + ", is allergen? = " + allergen + "}";
        }
    }

    
} //end of public class Ingredient