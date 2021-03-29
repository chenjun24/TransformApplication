package com.cj.plugin;


import com.android.build.api.transform.QualifiedContent;
import com.android.build.api.transform.Transform;
import com.android.build.api.transform.TransformException;
import com.android.build.api.transform.TransformInvocation;

import org.gradle.internal.impldep.com.google.common.collect.ImmutableSet;
import org.gradle.internal.impldep.com.google.common.collect.Sets;

import java.io.IOException;
import java.util.Set;


class StringTransform extends Transform {
    @Override
    public String getName() {
        return "PageTransform";
    }

    @Override
    public Set<QualifiedContent.ContentType> getInputTypes() {
        return ImmutableSet.<QualifiedContent.ContentType> of(QualifiedContent.DefaultContentType.CLASSES);
    }

    @Override
    public Set<? super QualifiedContent.Scope> getScopes() {
        // 作用范围
        return Sets.immutableEnumSet(
                QualifiedContent.Scope.PROJECT,
                QualifiedContent.Scope.PROJECT_LOCAL_DEPS,
                QualifiedContent.Scope.SUB_PROJECTS,
                QualifiedContent.Scope.SUB_PROJECTS_LOCAL_DEPS,
                QualifiedContent.Scope.EXTERNAL_LIBRARIES);
    }

    @Override
    public boolean isIncremental() {
        return false;
    }


    @Override
    public void transform(TransformInvocation transformInvocation) throws TransformException, InterruptedException, IOException {
        super.transform(transformInvocation);
    }
}
