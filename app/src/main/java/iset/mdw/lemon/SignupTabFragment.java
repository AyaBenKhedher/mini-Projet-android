package iset.mdw.lemon;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class SignupTabFragment extends Fragment {
private TextView Email,num,pass,confirm;
private Button signup;
float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragement, container, false);
        Email = root.findViewById(R.id.Email);
        num = root.findViewById(R.id.num);
        pass = root.findViewById(R.id.pass);
        confirm = root.findViewById(R.id.confirm);
        signup = root.findViewById(R.id.signup);


        Email.setTranslationY(800);
        num.setTranslationY(800);
        pass.setTranslationY(800);
        confirm.setTranslationY(800);
        signup.setTranslationY(800);

        Email.setAlpha(v);
        num.setAlpha(v);
        pass.setAlpha(v);
        confirm.setAlpha(v);
        signup.setAlpha(v);

        Email.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        num.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        pass.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        confirm.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();
        signup.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();



        return root;
    }
}
