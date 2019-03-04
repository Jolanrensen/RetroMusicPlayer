/*
 * Copyright (c) 2019 Hemanth Savarala.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by
 *  the Free Software Foundation either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 */

package code.name.monkey.retromusic.model;

import android.content.Context;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import io.reactivex.Observable;
import kotlinx.android.parcel.Parcelize;

@Parcelize
public abstract class AbsCustomPlaylist extends Playlist {
    public AbsCustomPlaylist(int id, @NonNull String name) {
        super(id, name);
    }

    @NonNull
    public abstract Observable<ArrayList<Song>> getSongs(@NonNull Context context);
}

