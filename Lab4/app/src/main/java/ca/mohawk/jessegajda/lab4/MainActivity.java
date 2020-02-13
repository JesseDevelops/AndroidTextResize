package ca.mohawk.jessegajda.lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopFragment.OnFragmentTopListener {

    TopFragment Top = new TopFragment();
    //SmallFragment sm = new SmallFragment();
    //MediumFragment md = new MediumFragment();
    //LargeFragment lg = new LargeFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft =  fm.beginTransaction();
        ft.add(R.id.frameTop, Top);
        ft.commit();
    }

    @Override
    public void  handleChoice(int num, String Edit){
        Bundle editTextBundle = new Bundle();
        editTextBundle.putString("EditText", Edit);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        switch(num){
            case 2:
                SmallFragment sm = new SmallFragment();
                sm.setArguments(editTextBundle);
                ft.replace(R.id.FrameBottom, sm);
                ft.commit();
                break;
            case 3:
                MediumFragment md = new MediumFragment();
                md.setArguments(editTextBundle);
                ft.replace(R.id.FrameBottom, md);
                ft.commit();
                break;
            case 4:
                LargeFragment lg = new LargeFragment();
                lg.setArguments(editTextBundle);
                ft.replace(R.id.FrameBottom, lg);
                ft.commit();
                break;


        }

    }
}
