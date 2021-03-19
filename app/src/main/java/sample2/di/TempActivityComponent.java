package sample2.di;


import com.mindorks.bootcamp.learndagger.di.scope.ActivityScope;

import dagger.Component;
import sample2.ui.SampleActivity;

@ActivityScope
@Component(dependencies = {TempApplicationComponent.class}, modules = {TempActivityModule.class})
public interface TempActivityComponent {
    void inject(SampleActivity activity);
}
