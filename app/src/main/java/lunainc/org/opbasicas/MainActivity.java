package lunainc.org.opbasicas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public EditText edit1;
    public EditText edit2;

    public RadioButton radioButtonSuma;
    public RadioButton radioButtonResta;
    public RadioButton radioButtonMulti;
    public RadioButton radioButtonDiv;

    public Button actionBtn;


    public TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        initViews();
        evento();

    }


    public void initViews(){

        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);


        radioButtonSuma = (RadioButton) findViewById(R.id.sumaRadioBtn);
        radioButtonResta = (RadioButton) findViewById(R.id.restaRadioBtn);
        radioButtonMulti = (RadioButton) findViewById(R.id.multiRadioBtn);
        radioButtonDiv = (RadioButton) findViewById(R.id.divisionRadioBtn);

        actionBtn = (Button) findViewById(R.id.button);

        textView = (TextView) findViewById(R.id.textView);

    }


    public void evento(){


        actionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                if (!edit1.getText().toString().isEmpty() && !edit2.getText().toString().isEmpty()){


                    /**
                     * Suma
                     */
                    if (radioButtonSuma.isChecked()){
                        opSuma();
                    }else if(radioButtonResta.isChecked()){//resta
                        opResta();
                    }else if(radioButtonMulti.isChecked()){
                        opMulti();

                    }else if (radioButtonDiv.isChecked()){
                        opDiv();
                    }





                }else {
                    textView.setText("Rellena los campos");
                }





            }
        });
    }

    private void opDiv() {
        String num1 = edit1.getText().toString();
        String num2 = edit2.getText().toString();


        float res = Float.parseFloat(num1 ) / Float.parseFloat(num2);


        textView.setText("Tu resultado es: "+res);
    }

    private void opMulti() {
        String num1 = edit1.getText().toString();
        String num2 = edit2.getText().toString();


        float res = Float.parseFloat(num1 ) * Float.parseFloat(num2);


        textView.setText("Tu resultado es: "+res);
    }

    private void opResta() {

        String num1 = edit1.getText().toString();
        String num2 = edit2.getText().toString();


        float res = Float.parseFloat(num1 ) - Float.parseFloat(num2);


        textView.setText("Tu resultado es: "+res);
    }

    private void opSuma() {

        String num1 = edit1.getText().toString();
        String num2 = edit2.getText().toString();


        float res = Float.parseFloat(num1 )+ Float.parseFloat(num2);


        textView.setText("Tu resultado es: "+res);

    }


}
