package com.example.atlandroid2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.atlandroid2.adapter.AnimalAdapter
import com.example.atlandroid2.adapter.TodoAdapter
import com.example.atlandroid2.databinding.CustomDialogBinding
import com.example.atlandroid2.databinding.FragmentHomeBinding
import com.example.atlandroid2.model.Animal
import com.example.atlandroid2.model.Oncelik
import com.example.atlandroid2.model.TodoModel
import com.example.atlandroid2.model.Yemek


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private val args: HomeFragmentArgs by navArgs()
    private val todoLar = arrayListOf<TodoModel>()
    private val todoAdapter = TodoAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvTodolar.adapter = todoAdapter

        binding.buttonAddTodo.setOnClickListener {
            melumatAl()
        }
    }

    private fun melumatAl() {
        val title = binding.editTextTitle.text.toString().trim()

        val secilenButton = binding.radioGrouponcelik.checkedRadioButtonId

        val oncelik = when (secilenButton) {
            R.id.radioButtonOrta -> Oncelik.MEDIUM
            R.id.radioButtonLazimsiz -> Oncelik.LOW
            else -> Oncelik.HIGH
        }

        val item = TodoModel(title, oncelik)

        todoLar.add(item)
        todoAdapter.updateList(todoLar)
    }


    private fun createDialog() {

        val alertDialog = AlertDialog.Builder(requireContext()).create()
        val dialogBinding = CustomDialogBinding.inflate(layoutInflater)

        alertDialog.setView(dialogBinding.root)


        dialogBinding.buttonYes.setOnClickListener {
            Toast.makeText(context, "Hesabdan çıxılmadı", Toast.LENGTH_LONG).show()
            alertDialog.dismiss()
        }

        alertDialog.show()

        /*  alertDialog.setTitle("Melumatlandırma")
          alertDialog.setMessage("Hesabdan çıxılsın mı?")
          alertDialog.setIcon(R.drawable.lock)

          alertDialog.setNeutralButton("Yox") { _, _ ->
              Toast.makeText(context,"Hesabdan çıxılmadı", Toast.LENGTH_LONG).show()
          }

          alertDialog.setPositiveButton("Beli"){_,_ ->
              Toast.makeText(context,"Hesabdan çıxıldı", Toast.LENGTH_LONG).show()
          }

          alertDialog.create().show()*/


    }

    private fun test() {
        /* val list = arrayListOf<Animal>()
       list.add(Animal("Lion", "5", R.drawable.jaguar))
       list.add(Animal("Qoyun", "10", R.drawable.qoyun))
       list.add(Animal("Ayi", "15", R.drawable.ayi))

       animalAdapter.updateList(list)


       /* var yemekler = arrayListOf<Yemek>()*/

        yemekler.add(Yemek(R.drawable.google,"dolma","AZE"))
        yemekler.add(Yemek(R.drawable.logo,"pizza","ITA"))
        yemekler.add(Yemek(R.drawable.message,"kufte","TR"))

        binding.rvSozler.adapter = yemeklerAdapter

        yemeklerAdapter.updateList(yemekler)

        /*  var sozler = arrayListOf<String>()
          sozler.add("salam")
          sozler.add("selam")
          sozler.add("günaydın")
          sozler.add("iyi günler")
          sozler.add("iyi akşamlar")
          sozler.add("salam")
          sozler.add("selam")
          sozler.add("günaydın")
          sozler.add("iyi günler")
          sozler.add("iyi akşamlar")
          sozler.add("salam")
          sozler.add("selam")
          sozler.add("günaydın")
          sozler.add("iyi günler")
          sozler.add("iyi akşamlar")
          sozler.add("salam")
          sozler.add("selam")
          sozler.add("günaydın")
          sozler.add("iyi günler")
          sozler.add("iyi akşamlar")
          sozler.add("salam")
          sozler.add("selam")
          sozler.add("günaydın")
          sozler.add("iyi günler")
          sozler.add("iyi akşamlar")

          binding.rvSozler.adapter = sozlerAdapter

          sozlerAdapter.updateList(sozler)*/


        /* var user = User("ali", "veli", "30", "test@test.com")


         binding.musteri = user*/*/
    }

}