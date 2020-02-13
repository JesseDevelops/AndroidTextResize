package ca.mohawk.jessegajda.lab4;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LargeFragment extends Fragment {
    String myString;

    public LargeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myview =  inflater.inflate(R.layout.fragment_large, container, false);
        Bundle editBund = this.getArguments();
        myString = editBund.getString("EditText");
        TextView txtOutput = (TextView) myview.findViewById(R.id.txtViewLarge);
        txtOutput.setText(myString);
        return myview;
    }

}
