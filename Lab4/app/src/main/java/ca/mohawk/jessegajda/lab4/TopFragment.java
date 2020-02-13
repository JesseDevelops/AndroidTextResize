package ca.mohawk.jessegajda.lab4;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class TopFragment extends Fragment implements View.OnClickListener{

View myview = null;
    public TopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        myview =  inflater.inflate(R.layout.fragment_top, container, false);
        Button btnSmall =  (Button) myview.findViewById(R.id.btnSmall);
        btnSmall.setOnClickListener(this);

        Button btnMedium = (Button) myview.findViewById(R.id.btnMedium);
        btnMedium.setOnClickListener(this);

        Button btnLarge = (Button) myview.findViewById(R.id.btnLarge);
        btnLarge.setOnClickListener(this);

        return myview;

    }

    @Override
    public void onClick(View v) {
        OnFragmentTopListener choiceListener = (OnFragmentTopListener) getActivity();
        EditText edit = getView().findViewById(R.id.editTxtName);
        String editText = edit.getText().toString();

        if (v.getId() == R.id.btnSmall) {
            choiceListener.handleChoice(2, editText);
        }
        else if(v.getId() == R.id.btnMedium) {
            choiceListener.handleChoice(3, editText);
        }
        else{
                choiceListener.handleChoice(4,editText);
        }
    }

    public interface OnFragmentTopListener{
        void handleChoice(int num, String Edit);
    }

}
