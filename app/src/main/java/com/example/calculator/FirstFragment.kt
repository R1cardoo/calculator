package com.example.calculator

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.calculator.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    lateinit var btn_0 : Button
    lateinit var btn_1 : Button
    lateinit var btn_2 : Button
    lateinit var btn_3 : Button
    lateinit var btn_4 : Button
    lateinit var btn_5 : Button
    lateinit var btn_6 : Button
    lateinit var btn_7 : Button
    lateinit var btn_8 : Button
    lateinit var btn_9 : Button
    lateinit var btn_point : Button
    lateinit var btn_clear : Button
    lateinit var btn_del : Button
    lateinit var btn_plus : Button
    lateinit var btn_minus : Button
    lateinit var btn_multply : Button
    lateinit var btn_divide : Button
    lateinit var btn_equal : Button
    lateinit var editText : EditText

    var clear_flag = false

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        btn_0 = binding.btn0
        btn_1 = binding.btn1
        btn_2 = binding.btn2
        btn_3 = binding.btn3
        btn_4 = binding.btn4
        btn_5 = binding.btn5
        btn_6 = binding.btn6
        btn_7 = binding.btn7
        btn_8 = binding.btn8
        btn_9 = binding.btn9
        btn_point = binding.btnPoint
        btn_clear = binding.btnClear
        btn_del = binding.btnDel
        btn_plus = binding.btnPlus
        btn_minus = binding.btnMinus
        btn_multply = binding.btnMultply
        btn_divide = binding.btnDivide
        btn_equal = binding.btnEqual
        editText = binding.etInput

        btn_0.setOnClickListener{
            val input = editText.text.toString()
            if(clear_flag){
                clear_flag = false;
                editText.setText("");
            }
            editText.setText(input + (btn_0).getText());
        }
        btn_1.setOnClickListener{
            val input = editText.text.toString()
            if(clear_flag){
                clear_flag = false;
                editText.setText("");
            }
            editText.setText(input + (btn_1).getText());
        }
        btn_2.setOnClickListener{
            val input = editText.text.toString()
            if(clear_flag){
                clear_flag = false;
                editText.setText("");
            }
            editText.setText(input + (btn_2).getText());
        }
        btn_3.setOnClickListener{
            val input = editText.text.toString()
            if(clear_flag){
                clear_flag = false;
                editText.setText("");
            }
            editText.setText(input + (btn_3).getText());
        }
        btn_4.setOnClickListener{
            val input = editText.text.toString()
            if(clear_flag){
                clear_flag = false;
                editText.setText("");
            }
            editText.setText(input + (btn_4).getText());
        }
        btn_5.setOnClickListener{
            val input = editText.text.toString()
            if(clear_flag){
                clear_flag = false;
                editText.setText("");
            }
            editText.setText(input + (btn_5).getText());
        }
        btn_6.setOnClickListener{
            val input = editText.text.toString()
            if(clear_flag){
                clear_flag = false;
                editText.setText("");
            }
            editText.setText(input + (btn_6).getText());
        }
        btn_7.setOnClickListener{
            val input = editText.text.toString()
            if(clear_flag){
                clear_flag = false;
                editText.setText("");
            }
            editText.setText(input + (btn_7).getText());
        }
        btn_8.setOnClickListener{
            val input = editText.text.toString()
            if(clear_flag){
                clear_flag = false;
                editText.setText("");
            }
            editText.setText(input + (btn_8).getText());
        }
        btn_9.setOnClickListener{
            val input = editText.text.toString()
            if(clear_flag){
                clear_flag = false;
                editText.setText("");
            }
            editText.setText(input + (btn_9).getText());
        }
        btn_point.setOnClickListener{
            val input = editText.text.toString()
            if(clear_flag){
                clear_flag = false;
                editText.setText("");
            }
            editText.setText(input + (btn_point).getText());
        }
        btn_clear.setOnClickListener{
            clear_flag = false;
            editText.setText("");
        }
        btn_del.setOnClickListener{
            var input = editText.text.toString()
            if(clear_flag){
                clear_flag = false;
                input = "";
                editText.setText("");
            }else if(input != null || !input.equals("")) {
                editText.setText(input.substring(0, input.length - 1))
            }
        }
        btn_plus.setOnClickListener{
            var input = editText.text.toString()
            if(clear_flag){
                clear_flag = false;
                input = "";
                editText.setText("");
            }
            editText.setText(input + " " + (btn_plus).getText() + " ");
        }
        btn_minus.setOnClickListener{
            var input = editText.text.toString()
            if(clear_flag){
                clear_flag = false;
                input = "";
                editText.setText("");
            }
            editText.setText(input + " " + (btn_minus).getText() + " ");
        }
        btn_multply.setOnClickListener{
            var input = editText.text.toString()
            if(clear_flag){
                clear_flag = false;
                input = "";
                editText.setText("");
            }
            editText.setText(input + " " + (btn_multply).getText() + " ");
        }
        btn_divide.setOnClickListener{
            var input = editText.text.toString()
            if(clear_flag){
                clear_flag = false;
                input = "";
                editText.setText("");
            }
            editText.setText(input + " " + (btn_divide).getText() + " ");
        }
        btn_equal.setOnClickListener{
            getResult()
            Log.d("wakawaka","give a result!")
            clear_flag = false
        }
        return binding.root

    }

    fun getResult() {
        val exp = editText.getText().toString();
        if(exp.equals(""))
            return;
        if(!exp.contains(" "))
            return;
        if(clear_flag){
            clear_flag = false;
            return;
        }
        clear_flag = true;
        var result = 0.0
        //运算符前的数字
        var s1 = exp.substring(0,exp.indexOf(" "));
        //运算符
        var op = exp.substring(exp.indexOf(" ")+1,exp.indexOf(" ")+2);
        //运算符后的数字
        var s2 = exp.substring(exp.indexOf(" ")+3);

        if(!s1.equals("")&&!s2.equals("")) {
            var d1 = s1.toDouble()
            var d2 = s2.toDouble()
            if (op.equals("+")) {
                result = d1 + d2
            } else if (op.equals("-")) {
                result = d1 - d2
            } else if (op.equals("*")) {
                result = d1 * d2
            } else if (op.equals("/")) {
                if (d2 == 0.0)
                    result = 0.0;
                else
                    result = d1 / d2;
            }

            if (!s1.contains(".") && !s2.contains(".") && !op.equals("/")) {
                val r = result.toString();
                editText.setText(r + "");
            } else
                editText.setText(result.toString() + "");
        }else if(!s1.equals("") && s2.equals("")){
            editText.setText(exp)
        }else if(s1.equals("") && !s2.equals("")){
            var d2 = s2.toDouble()
            if (op.equals("+")) {
                result = 0 + d2
            } else if (op.equals("-")) {
                result = 0 - d2
            } else if (op.equals("*")) {
                result = 0.0
            } else if (op.equals("/")) {
                result = 0.0
            }

            if (!s1.contains(".") && !s2.contains(".")) {
                var r = result.toString();
                editText.setText(r + "");
            } else
                editText.setText(result.toString() + "");
        }else {
            editText.setText("");
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}