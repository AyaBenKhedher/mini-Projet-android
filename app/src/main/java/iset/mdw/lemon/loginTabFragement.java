package iset.mdw.lemon;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class loginTabFragement extends Fragment {
    private TextView email,pass,forget;
    private Button login;
    float v = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
    ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragement, container, false);

    email = root.findViewById(R.id.Email);
    pass = root.findViewById(R.id.pass);
    forget = root.findViewById(R.id.forget);
    login = root.findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (!email.getText().toString().isEmpty() && !pass.getText().toString().isEmpty()) {
                    Intent i = new Intent(getActivity(), MainActivity.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText( getContext(),"Remplir tous les champs svp",Toast.LENGTH_SHORT).show();
                }
            }
        });
        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://https://mail.google.com/mail/u/0/#inbox"));
                startActivity(i);
            }
        });


        email.setTranslationY(800);
        pass.setTranslationY(800);
        forget.setTranslationY(800);
        login.setTranslationY(800);


        email.setAlpha(v);
        pass.setAlpha(v);
        forget.setAlpha(v);
        login.setAlpha(v);

        email.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forget.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(500).start();
        login.animate().translationY(0).alpha(1).setDuration(800).setStartDelay(700).start();



    return root;
}
}
