package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**                                                                                                                                        \!                                        ".
 *````                                                                                                                                      *                   StyleBox["name", "TI"] * Usage:            MorphologicalTransform[image, transformation, n] applies n iterations of transformation on image.
 *                                                                                                                                                                                      * 
 * Name:             MorphologicalTransform                                                                                                                                             * Options:          Padding -> Automatic
 *                                                                                                                                                                                      * 
 * Full name:        System`MorphologicalTransform                                                                                                                                      *                   Protected
 *                                                                                                                                                                                      * Attributes:       ReadProtected
 *                   MorphologicalTransform[image, f] applies the function f to the 3×3 neighborhood of each pixel in a binary image image.                                             * 
 *                   MorphologicalTransform[image, rule] applies a morphological transformation specified by a rule number rule.                                                        *                   local: paclet:ref/MorphologicalTransform
 *                   MorphologicalTransform[image, "name"] uses a named transformation "                                                                                                * Documentation:    web: http://reference.wolfram.com/language/ref/MorphologicalTransform.html
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
fun morphologicalTransform(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MorphologicalTransform", arguments.toMutableList(), options)
}
