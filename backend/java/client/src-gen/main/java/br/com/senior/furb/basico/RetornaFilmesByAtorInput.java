package br.com.senior.furb.basico;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.*;

public class RetornaFilmesByAtorInput {
    
    public String ator;
    
    public RetornaFilmesByAtorInput() {
    }
    
    /** 
     * This constructor allows initialization of all fields, required and optional.
     */
    public RetornaFilmesByAtorInput(String ator) {
        this.ator = ator;
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
        if (ator != null) {
            ret = 31 * ret + ator.hashCode();
        }
        return ret;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RetornaFilmesByAtorInput)) {
            return false;
        }
        RetornaFilmesByAtorInput other = (RetornaFilmesByAtorInput) obj;
        if ((ator == null) != (other.ator == null)) {
            return false;
        }
        if ((ator != null) && !ator.equals(other.ator)) {
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
    	sb.append("ator=").append(ator == null ? "null" : ator);
    	sb.append(']');
    }
    
}
