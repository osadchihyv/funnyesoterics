package com.osady.funnyesoterics
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import kotlin.random.Random


//константа для ключа сохранения состояния
private const val LAST_RANDOM_VALUE = "LAST_RANDOM_VALUE"

class AnimalFragment : Fragment() {

    //ранняя инициализация переменных для вью
    private lateinit var animalImageView: ImageView
    private lateinit var randomizeButton: Button

    private var randomValue = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_animal, container, false)
        animalImageView = view.findViewById(R.id.animal_image_view)
        randomizeButton = view.findViewById(R.id.randomize_button)
        savedInstanceState?.let { randomValue = it.getInt(LAST_RANDOM_VALUE) }
        rollAnimal(randomValue)

        randomizeButton.setOnClickListener {
            randomValue = Random.nextInt(1, 6)
            rollAnimal(randomValue)
        }

        return view
    }

    //подкидывает кубик
    private fun rollAnimal(randomValue: Int) {
        animalImageView.setImageResource(
            when (randomValue) {
                1 -> R.drawable.animal1
                2 -> R.drawable.animal2
                3 -> R.drawable.animal3
                4 -> R.drawable.animal4
                5 -> R.drawable.animal5
                6 -> R.drawable.animal6
                else -> R.drawable.animal1
            }
        )
    }

    //сохраняет состояние
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(LAST_RANDOM_VALUE, randomValue)
    }

}