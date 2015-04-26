// This is a generated file. Not intended for manual editing.
package com.perl5.lang.perl.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.perl5.lang.perl.lexer.PerlElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.perl5.lang.perl.psi.*;

public class PerlArrayImpl extends ASTWrapperPsiElement implements PerlArray {

  public PerlArrayImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PerlVisitor) ((PerlVisitor)visitor).visitArray(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PsiElement getPerlVariableArray() {
    return findChildByType(PERL_VARIABLE_ARRAY);
  }

  @Override
  @Nullable
  public PsiElement getPerlVariableArrayBuiltIn() {
    return findChildByType(PERL_VARIABLE_ARRAY_BUILT_IN);
  }

}