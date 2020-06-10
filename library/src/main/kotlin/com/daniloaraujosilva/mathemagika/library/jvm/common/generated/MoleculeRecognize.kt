package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             MoleculeRecognize
 * 
 * Full name:        System`MoleculeRecognize
 * 
 * Usage:            MoleculeRecognize[image] recognizes a molecule in image and returns it as a Molecule object.
 * 
 * Options:          None
 * 
 * Attributes:
 * 
 *                   local: paclet:ref/MoleculeRecognize
 * Documentation:    web: http://reference.wolfram.com/language/ref/MoleculeRecognize.html
 * 
 * Definitions:      MoleculeRecognize[Chemistry`MolVecLink`Private`input___] := Module[{Chemistry`MolVecLink`Private`args = System`Private`Arguments[MoleculeRecognize[Chemistry`MolVecLink`Private`input], 1], Chemistry`MolVecLink`Private`res}, (Chemistry`MolVecLink`Private`res = Chemistry`MolVecLink`Private`iMoleculeRecognize[Chemistry`MolVecLink`Private`input]; Chemistry`MolVecLink`Private`res /; Chemistry`MolVecLink`Private`res =!= $Failed) /; Chemistry`MolVecLink`Private`args =!= {}]
 * 
 * Own values:       None
 * 
 * Down values:      MoleculeRecognize[Chemistry`MolVecLink`Private`input___] := Module[{Chemistry`MolVecLink`Private`args = System`Private`Arguments[MoleculeRecognize[Chemistry`MolVecLink`Private`input], 1], Chemistry`MolVecLink`Private`res}, (Chemistry`MolVecLink`Private`res = Chemistry`MolVecLink`Private`iMoleculeRecognize[Chemistry`MolVecLink`Private`input]; Chemistry`MolVecLink`Private`res /; Chemistry`MolVecLink`Private`res =!= $Failed) /; Chemistry`MolVecLink`Private`args =!= {}]
 * 
 * Up values:        None
 * 
 * Sub values:       None
 * 
 * Default value:    None
 * 
 * Numeric values:   None
 */
fun moleculeRecognize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MoleculeRecognize", arguments.toMutableList(), options)
}
