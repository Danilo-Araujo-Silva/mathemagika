package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 *                   InputForm
 *                   OutputForm
 *                   TextForm
 *                   CForm
 *                   FortranForm
 *                   ScriptForm
 *                   MathMLForm
 *                   TeXForm
 *                   StandardForm
 * Name:             TraditionalForm
 *
 *                   System`InputForm
 *                   System`OutputForm
 *                   System`TextForm
 *                   System`CForm
 *                   System`FortranForm
 *                   System`ScriptForm
 *                   System`MathMLForm
 *                   System`TeXForm
 *                   System`StandardForm
 * Full name:        System`TraditionalForm
 *
 *                   {InputForm[expr] prints as a version of expr suitable for input to the Wolfram Language. }
 *                   {OutputForm[expr] prints as a two-dimensional representation of expr using only keyboard characters. }
 *                   {System`TextForm}
 *                   {CForm[expr] prints as a C language version of expr. }
 *                   {FortranForm[expr] prints as a Fortran language version of expr. }
 *                   {System`ScriptForm}
 *                   {MathMLForm[expr] prints as a MathML form of expr. }
 *                   {TeXForm[expr] prints as a TeX version of expr. }
 *                   {StandardForm[expr] prints as the standard Wolfram Language two-dimensional representation of expr. }
 * Usage:            {TraditionalForm[expr] prints as an approximation to the traditional mathematical notation for expr. }
 *
 *                   NumberMarks :> $NumberMarks
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 * Options:          ParameterVariables -> {}
 *
 *                   Protected
 *                   Protected
 *                   Protected
 *                   Protected
 *                   Protected
 *                   Protected
 *                   Protected
 *                   Protected
 *                   Protected                   ReadProtected
 * Attributes:       Protected                   ReadProtected
 *
 *                   local: <>{<|Local -> paclet:ref/InputForm, Web -> http://reference.wolfram.com/language/ref/InputForm.html|>, <|Local -> paclet:ref/OutputForm, Web -> http://reference.wolfram.com/language/ref/OutputForm.html|>, None, <|Local -> paclet:ref/CForm, Web -> http://reference.wolfram.com/language/ref/CForm.html|>, <|Local -> paclet:ref/FortranForm, Web -> http://reference.wolfram.com/language/ref/FortranForm.html|>, None, <|Local -> paclet:ref/MathMLForm, Web -> http://reference.wolfram.com/language/ref/MathMLForm.html|>, <|Local -> paclet:ref/TeXForm, Web -> http://reference.wolfram.com/language/ref/TeXForm.html|>, <|Local -> paclet:ref/StandardForm, Web -> http://reference.wolfram.com/language/ref/StandardForm.html|>, <|Local -> paclet:ref/TraditionalForm, Web -> http://reference.wolfram.com/language/ref/TraditionalForm.html|>}[Local]
 * Documentation:    web: <>{<|Local -> paclet:ref/InputForm, Web -> http://reference.wolfram.com/language/ref/InputForm.html|>, <|Local -> paclet:ref/OutputForm, Web -> http://reference.wolfram.com/language/ref/OutputForm.html|>, None, <|Local -> paclet:ref/CForm, Web -> http://reference.wolfram.com/language/ref/CForm.html|>, <|Local -> paclet:ref/FortranForm, Web -> http://reference.wolfram.com/language/ref/FortranForm.html|>, None, <|Local -> paclet:ref/MathMLForm, Web -> http://reference.wolfram.com/language/ref/MathMLForm.html|>, <|Local -> paclet:ref/TeXForm, Web -> http://reference.wolfram.com/language/ref/TeXForm.html|>, <|Local -> paclet:ref/StandardForm, Web -> http://reference.wolfram.com/language/ref/StandardForm.html|>, <|Local -> paclet:ref/TraditionalForm, Web -> http://reference.wolfram.com/language/ref/TraditionalForm.html|>}[Web]
 *
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 * Definitions:      None
 *
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 * Own values:       None
 *
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 * Down values:      None
 *
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 * Up values:        None
 *
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 * Sub values:       None
 *
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 * Default value:    None
 *
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 *                   None
 * Numeric values:   None
 */
fun `$PrintForms`(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("\$PrintForms", arguments.toMutableList(), options)
}
