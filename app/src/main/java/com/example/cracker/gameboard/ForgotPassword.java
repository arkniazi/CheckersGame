package com.example.cracker.gameboard;

import android.support.v4.app.Fragment;

/**
 * Created by cracker on 12/20/2017.
 */

public class ForgotPassword extends Fragment {

//    private EditText inputEmail;
//    private Button btnReset, btnBack;
//    private FirebaseAuth auth;
//    private ProgressBar progressBar;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_reset_password);
//
//        inputEmail = (EditText) findViewById(R.id.email);
//        btnReset = (Button) findViewById(R.id.btn_reset_password);
//        btnBack = (Button) findViewById(R.id.btn_back);
//        progressBar = (ProgressBar) findViewById(R.id.progressBar);
//
//        auth = FirebaseAuth.getInstance();
//
//        btnBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });
//
//        btnReset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String email = inputEmail.getText().toString().trim();
//
//                if (TextUtils.isEmpty(email)) {
//                    Toast.makeText(getApplication(), "Enter your registered email id", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//                progressBar.setVisibility(View.VISIBLE);
//                auth.sendPasswordResetEmail(email)
//                        .addOnCompleteListener(new OnCompleteListener<Void>() {
//                            @Override
//                            public void onComplete(@NonNull Task<Void> task) {
//                                if (task.isSuccessful()) {
//                                    Toast.makeText(ResetPasswordActivity.this, "We have sent you instructions to reset your password!", Toast.LENGTH_SHORT).show();
//                                } else {
//                                    Toast.makeText(ResetPasswordActivity.this, "Failed to send reset email!", Toast.LENGTH_SHORT).show();
//                                }
//
//                                progressBar.setVisibility(View.GONE);
//                            }
//                        });
//            }
//        });
//    }
//
//}
}
