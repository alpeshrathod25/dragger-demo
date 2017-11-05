package com.raywenderlich.android.deezfoodz.dagger;

import com.raywenderlich.android.deezfoodz.ui.food.FoodActivity;
import com.raywenderlich.android.deezfoodz.ui.food.FoodPresenterImpl;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzActivity;
import com.raywenderlich.android.deezfoodz.ui.foodz.FoodzPresenterImpl;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by alpesh on 3/11/17.
 */

@Singleton
@Component(modules = {AppModule.class,PresenterModule.class,NetworkingModule.class})
public interface AppComponent {
    void inject(FoodzActivity target);
    void inject(FoodActivity target);
    void inject(FoodzPresenterImpl target);
    void inject(FoodPresenterImpl target);
}
