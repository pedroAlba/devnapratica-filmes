package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class RetornaFilmesByGeneroOutput {
    
    public java.util.List<Filme> filmes;
    
    public RetornaFilmesByGeneroOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public RetornaFilmesByGeneroOutput(java.util.List<Filme> filmes) {
        this.filmes = filmes;
    }
    
    public void validate() {
        validate(true);
    }
    
    public void validate(boolean required) {
        validate(null, required);
    }
    
    public void validate(Map<String, Object> headers, boolean required) {
    	validate(headers, required, new ArrayList<>());
    }
    
    void validate(Map<String, Object> headers, boolean required, List<Object> validated) {
    	BasicoValidator.validate(this, headers, required, validated);
    }
    @Override
    public int hashCode() {
        int ret = 1;
        if (filmes != null) {
            ret = 31 * ret + filmes.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetornaFilmesByGeneroOutput)) {
            return false;
        }
        RetornaFilmesByGeneroOutput other = (RetornaFilmesByGeneroOutput) obj;
        if ((filmes == null) != (other.filmes == null)) {
            return false;
        }
        if ((filmes != null) && !filmes.equals(other.filmes)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	toString(sb, new ArrayList<>());
    	return sb.toString();
    }
    
    void toString(StringBuilder sb, List<Object> appended) {
    	sb.append(getClass().getSimpleName()).append(" [");
    	if (appended.contains(this)) {
    		sb.append("<Previously appended object>").append(']');
    		return;
    	}
    	appended.add(this);
    	sb.append("filmes=<");
    	if (filmes == null) {
    		sb.append("null");
    	} else {
    		sb.append('[');
    		int last = filmes.size() - 1;
    		for (int i = 0; i <= last; i++) {
    			filmes.get(i).toString(sb, appended);
    			if (i < last) {
    				sb.append(", ");
    			}
    		}
    		sb.append(']');
    	}
    	sb.append('>');
    	sb.append(']');
    }
    
}
