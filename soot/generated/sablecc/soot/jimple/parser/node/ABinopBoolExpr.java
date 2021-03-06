/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class ABinopBoolExpr extends PBoolExpr
{
    private PBinopExpr _binopExpr_;

    public ABinopBoolExpr()
    {
        // Constructor
    }

    public ABinopBoolExpr(
        @SuppressWarnings("hiding") PBinopExpr _binopExpr_)
    {
        // Constructor
        setBinopExpr(_binopExpr_);

    }

    @Override
    public Object clone()
    {
        return new ABinopBoolExpr(
            cloneNode(this._binopExpr_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABinopBoolExpr(this);
    }

    public PBinopExpr getBinopExpr()
    {
        return this._binopExpr_;
    }

    public void setBinopExpr(PBinopExpr node)
    {
        if(this._binopExpr_ != null)
        {
            this._binopExpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._binopExpr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._binopExpr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._binopExpr_ == child)
        {
            this._binopExpr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._binopExpr_ == oldChild)
        {
            setBinopExpr((PBinopExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
