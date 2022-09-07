package edu.tomerbu.lec18.ui.main;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintSet;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;

public class MapFragment extends SupportMapFragment {
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        getMapAsync(this::onMapReady);

    }

    private void onMapReady(GoogleMap googleMap) {
        //put marker
    }
}

//constraintLayout from code
//משחק הזכרון - רנדומליות לתמונות
//כמה קלפים יש? 4
//כמה קלפים יש? 8
//כמה קלפים יש? 12
//כמה קלפים יש? 16
//כמה קלפים יש? 20