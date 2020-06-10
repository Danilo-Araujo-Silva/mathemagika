package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             AnnotationValue
 * 
 * Full name:        System`AnnotationValue
 * 
 *                   AnnotationValue[obj, key] gives the annotation value associated with key for the object obj.
 * Usage:            AnnotationValue[{obj, itemspec}, key] gives the annotation value associated with key for items specified by itemspec in obj. 
 * 
 * Options:          None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/AnnotationValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/AnnotationValue.html
 * 
 * Definitions:      None
 * 
 * Own values:       None
 * 
 * Down values:      None
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun annotationValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AnnotationValue", arguments.toMutableList(), options)
}
