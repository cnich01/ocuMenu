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

class DinnerActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dinner)

        val backBtn = findViewById<Button>(R.id.dinnerBackBtn)
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

    override fun onItemSelected(parent: AdapterView<*>, view: View?, pos: Int, id: Long)
    {
        val textView: TextView = findViewById(R.id.dinnerTxt) as TextView
        textView.text = "Please select a day"
        if(pos == 0) // Sunday
        {
            textView.text = "Italian Sausage with Peppers\n\nEggplant Rollatini\n\nPenne Pasta\n\nMarinara Sauce\n\n" +
                    "Parmesan Cauliflower\n\nSteamed Broccoli\n\nFried Chicken Tenders\n\nFried Onion Rings"
        }
        else if(pos == 1) // Monday
        {
            textView.text = "Sweet Potato Black Bean Enchiladas\n\nMexican Lasagna\n\nSpanish Rice\n\nRoasted Peppers w/ Garlic and Herbs\n\n" +
                    "Roasted Corn\n\nBBQ Dry Rub Pollock Wings\n\nCurly-Q French Fries\n\nPepperoni Pizza"
        }
        else if(pos == 2) // Tuesday
        {
            textView.text = "Moroccan Chicken\n\nMoroccan Vegetable Stew with Quinoa\n\n Lemon Couscous\n\n" +
                    "Grilled Asparagus\n\nRoasted Vegetables\n\nHot Honey Chicken Tenders\n\n" +
                    "Macaroni and Cheese Bites\n\n"
        }
        else if(pos == 3)  // Wednesday
        {
            textView.text = "Chicken and Sausage Jambalaya\n\nTofu Jambalaya\n\nFresh Steamed Carrots\n\n" +
                    "Lemon & Parsley Roasted Cauliflower\n\nSweet Cornbread\n\nGrilled Eggplant, Mozzarella\n\nZucchini, Tomato, Squash and Mushroom\n\nGrilled Chicken"
        }
        else if(pos == 4) // Thursday
        {
            textView.text = "Corned Beef\n\nTuscan White Bean Stew\n\n" +
                    "Steamed Red Potatoes\n\nFresh Steamed Carrots\n\nBraised Seasoned Cabbage\n\nIrish Soda Bread\n\n" +
                    "Grilled Bacon, Tomato and Cheese\n\nGrilled Green Beans"
        }
        else if(pos == 5) // Friday
        {
            textView.text = "Pollock Bites\n\nEverything Sesame Seasoning Fried Tofu\n\nSignature Mac & Cheese\n\n" +
                    "Grilled Green Beans\n\nCheddar Onion Biscuits\n\nChicken n' Waffle\n\nGrilled Brussels Sprouts with Lemon\n\nHot Dog"
        }
        else if(pos == 6) // Saturday
        {
            textView.text = "BBQ Rotisserie Chicken\n\nVegan Cauliflower Ribs\n\nBBQ Baked Beans\n\nCorn on the Cob\n\n" +
                    "Roasted Brussels Sprouts\n\nSweet Cornbread\n\nMaple Bacon Cheddar Burger"
        }
    }// end onItemSelected

    override fun onNothingSelected(parent: AdapterView<*>)
    {
        val textView: TextView = findViewById(R.id.dinnerTxt) as TextView
        textView.text = "Please select a day"
    }// end onNothingSelected
}// end DinnerActivity