package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             CDFDeploy
 *
 * Full name:        System`CDFDeploy
 *
 *                   CDFDeploy["file.cdf", expr] deploys expr in a form that can be played by Wolfram Player.
 *                   CDFDeploy["file.cdf", notebook] deploys a notebook.
 *                   CDFDeploy["file.cdf", NotebookSelection[notebook]] deploys the current selection in notebook.
 * Usage:            CDFDeploy["outfile.cdf", "infile.nb"] deploys the notebook "infile.nb".
 *
 *                   Deployed -> True
 * Options:          Target -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/CDFDeploy
 * Documentation:    web: http://reference.wolfram.com/language/ref/CDFDeploy.html
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
fun cDFDeploy(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("CDFDeploy", arguments.toMutableList(), options)
}
