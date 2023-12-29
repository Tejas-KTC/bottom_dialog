package com.example.bottom_dialog;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class Bottomsheet extends BottomSheetDialogFragment {
    public Bottomsheet() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.row_add_item,container,false);

        Button btnadd=view.findViewById(R.id.new_add_task_btn);
        EditText ed= view.findViewById(R.id.new_add_task_name);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getContext(), MainActivity.class);
                intent.putExtra("data",ed.getText().toString());
                startActivity(intent);
            }
        });


        return view;
    }
}
