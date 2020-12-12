/**
 * Created on Jan 26, 2006
 *
 * Copyright (c) 2005 Ganges Organisation all rights reserved.
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of version 2 of the GNU Lesser General Public License as
 * published by the Free Software Foundation. See the GNU Lesser General Public License for more details.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package org.ganges.expressionengine.expressions.relational;

import org.ganges.expressionengine.exceptions.ExpressionEngineException;
import org.ganges.types.Type;
import org.ganges.types.ValueObject;


/**
 * Performs the less than operation.
 * 
 * @author Parmod Kamboj
 * @author Mohit Gupta
 * @version 1.0
 */
public class LTExpression extends GTEExpression {

	static {
		addTypePair( LTExpression.class, Type.LONG, Type.LONG, Type.BOOLEAN );
		addTypePair( LTExpression.class, Type.DOUBLE, Type.DOUBLE, Type.BOOLEAN );
		addTypePair( LTExpression.class, Type.LONG, Type.DOUBLE, Type.BOOLEAN );
		addTypePair( LTExpression.class, Type.DOUBLE, Type.LONG, Type.BOOLEAN );
	}

	/**
	 * Returns the value of less than operation.
	 * 
	 * @see org.ganges.expressionengine.expressions.Expression#getValue()
	 */
	@Override
	public ValueObject getValue() throws ExpressionEngineException {
		Boolean value = (Boolean) super.getValue().getValue();

		return new ValueObject( value.booleanValue() ? Boolean.FALSE : Boolean.TRUE, Type.BOOLEAN );
	}
}