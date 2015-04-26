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

public class PerlScalarValueImpl extends ASTWrapperPsiElement implements PerlScalarValue {

  public PerlScalarValueImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PerlVisitor) ((PerlVisitor)visitor).visitScalarValue(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PerlArrayValue getArrayValue() {
    return findChildByClass(PerlArrayValue.class);
  }

  @Override
  @Nullable
  public PerlFunctionCall getFunctionCall() {
    return findChildByClass(PerlFunctionCall.class);
  }

  @Override
  @Nullable
  public PerlScalar getScalar() {
    return findChildByClass(PerlScalar.class);
  }

  @Override
  @Nullable
  public PerlScalarValue getScalarValue() {
    return findChildByClass(PerlScalarValue.class);
  }

  @Override
  @Nullable
  public PsiElement getPerlDqString() {
    return findChildByType(PERL_DQ_STRING);
  }

  @Override
  @Nullable
  public PsiElement getPerlDxString() {
    return findChildByType(PERL_DX_STRING);
  }

  @Override
  @Nullable
  public PsiElement getPerlMultilineMarker() {
    return findChildByType(PERL_MULTILINE_MARKER);
  }

  @Override
  @Nullable
  public PsiElement getPerlNumber() {
    return findChildByType(PERL_NUMBER);
  }

  @Override
  @Nullable
  public PsiElement getPerlSigilScalar() {
    return findChildByType(PERL_SIGIL_SCALAR);
  }

  @Override
  @Nullable
  public PsiElement getPerlSqString() {
    return findChildByType(PERL_SQ_STRING);
  }

  @Override
  @Nullable
  public PsiElement getPerlVersion() {
    return findChildByType(PERL_VERSION);
  }

}