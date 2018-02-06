import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_primerfragment.*
import kotlinx.android.synthetic.main.fragment_segundofragment.*
import org.jetbrains.support.v4.toast

/**
 * Created by Alex on 04/02/2018.
 */
class PrimerFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_primerfragment, container)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // añadimos funcionalidad al boton
        main_button.setOnClickListener {
            toast("Mensaje: ${main_editText.text}")
            main2_textview.text  = main_editText.text
        }
    }
}