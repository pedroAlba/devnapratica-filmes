package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class RetornaFilmesByDiretorOutput {
    
    public java.util.List<Filme> filmesMessage;
    
    public RetornaFilmesByDiretorOutput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public RetornaFilmesByDiretorOutput(java.util.List<Filme> filmesMessage) {
        this.filmesMessage = filmesMessage;
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
        if (filmesMessage != null) {
            ret = 31 * ret + filmesMessage.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetornaFilmesByDiretorOutput)) {
            return false;
        }
        RetornaFilmesByDiretorOutput other = (RetornaFilmesByDiretorOutput) obj;
        if ((filmesMessage == null) != (other.filmesMessage == null)) {
            return false;
        }
        if ((filmesMessage != null) && !filmesMessage.equals(other.filmesMessage)) {
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
    	sb.append("filmesMessage=<");
    	if (filmesMessage == null) {
    		sb.append("null");
    	} else {
    		sb.append('[');
    		int last = filmesMessage.size() - 1;
    		for (int i = 0; i <= last; i++) {
    			filmesMessage.get(i).toString(sb, appended);
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
