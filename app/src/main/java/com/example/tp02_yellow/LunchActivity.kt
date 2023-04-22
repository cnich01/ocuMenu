package com.example.tp02_yellow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class LunchActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lunch)

        val backBtn = findViewById<Button>(R.id.lunchBackBtn)
        backBtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val spinner: Spinner = findViewById(R.id.daySelectSpinner)
        spinner.onItemSelectedListener = this

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.days_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }
    }

    override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long) {
        val textView: TextView = findViewById(R.id.lunchTxt) as TextView
        textView.text = "Please select a day"
        if(pos == 0){
            textView.text = "Chicken Marsala\n\nStuffed Shells in Marinara\n\nGreen Beans\n\nHerb Roasted Butternut Squash\n\n" +
                    "Garlic Breadstick\n\nCheese Pizza\n\nPepperoni Pizza\n\nChicken Bacon Ranch Pizza"
        }
        else if(pos == 1){
            textView.text = "Chicken n' Waffle\n\nNashville Meatless Chicken and Waffle\n\nBrussels, Bacon, Habanada Pepper Hash\n\nGrilled Corn \n\n" +
                    "Pancake and Waffle Syrup\n\nWhipped Butter\n\nGreen Beans \n\nGochujang Tofu Vegetable Stir Fry"
        }
        else if(pos == 2){
            textView.text = "Beef, Mushroom, and Snow Pea Stir Fry\n\nEdamame Fried Rice\n\n Vegetable Lo Mein\n\n" +
                    "Roasted Carrots \n\nBraised Baby Bok Choy\n\nDelhi Style Tofu Curry \n\n" +
                    "Herbed Steamed Brown Rice\n\nTurmeric Roasted Root Vegetables"
        }
        else if(pos == 3){
            textView.text = "Grilled Chicken Alfredo\n\n\nYellow Squash with Red Onions \n\nSpicy Green Beans\n\n" +
                    "Garlic Breadstick\n\nChickpea and Date Tagine\n\nCurry Coconut Mustard Greens\n\nBratwurst, Sauerkraut on Potato Roll\n\nSauteed Mushrooms"
        }
        else if(pos == 4){
            textView.text = "Kielbasa with Peppers and Onion \n\nPotato and Cheese Pierogi with Onions \n\n" +
                    "Gingered Snow Peas\n\nMustard Greens, Chili, Garlic\n\nPretzel Roll \n\nWhole Grain Mustard\n\n" +
                    "Sofritas Black Bean Bowl\n\nBaked Corn Tortilla Strips"
        }
        else if(pos == 5){
            textView.text = "Thai Red Chili Spiced Chicken\n\nThai Basil Tofu\n\nBasmati Rice with Cumin\n\n" +
                    "Chicken Kielbasa Sausage\n\nVegetable Spring Roll\n\nSauteed Spinach\n\nSweet Thai Chili Sauce\n\nBeyond Bolognese"
        }
        else if(pos == 6){
            textView.text = "Old Bay Grilled Cod\n\nWarm Quinoa and Corn Salad\n\nLinguine with Tomatoes and Garlic\n\nSauteed Spinach\n\n" +
                    "Roasted Yellow Squash\n\nGarlic Breadstick \n\nLemon Wedge"
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>) {
        val textView: TextView = findViewById(R.id.lunchTxt) as TextView
        textView.text = "Please select a day"
    }

}