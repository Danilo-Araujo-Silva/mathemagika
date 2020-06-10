package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             TeXSave
 * 
 * Full name:        System`TeXSave
 * 
 *                   TeXSave["file.tex"] saves a TeX version of the current input notebook in the front end. 
 *                   TeXSave["file.tex", "source.nb"] saves a TeX version of the notebook from the file source . nb. 
 * Usage:            TeXSave["file.tex", notebook] saves a TeX version of the notebook corresponding to the specified notebook object. 
 * 
 * Options:          None
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/TeXSave
 * Documentation:    web: http://reference.wolfram.com/language/ref/TeXSave.html
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
fun teXSave(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TeXSave", arguments.toMutableList(), options)
}
