package my.benjamin.com.home;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class hardware extends AppCompatActivity {
    private TextView title;
    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardware);

        title=(TextView)findViewById(R.id.title);
        message=(TextView)findViewById(R.id.message);

        title.setText("this is my title");
        String somemassage="INTRODUCTION TO PROGRAMMING CONCEPTS\n" +
                "Lecturer: Collinson C. M. Agbesi Email: koliny3k@gmail.com Mobile: 0208258096\n" +
                "Recommended Textbooks 1. K. Ponnambalam and Tiuley Alguindigue, “A C++ Primer for Engineers: An Object Oriented Approach”, 1997\n" +
                "OVERVIEW OF PROGRAMMING LANGUAGES\n" +
                "\uF06F A programming language is the basic tool of all programmers. All software is written in a programming language. \uF06F It is a set of rules that provides a way of telling a computer what operations to perform. \uF06F It is a formal notation for expressing algorithms. \uF06F It provides a linguistic framework for describing computations. \uF06F E.g., English is a natural language. It has words, symbols and grammatical rules. The words and symbols have meanings depending on what it does or its functions. A programming language also has words, symbols and grammatical rules. \uF06F The grammatical rules are called syntax and the meanings are called semantics. Each programming language has a different set of syntax rules and semantics.\n" +
                "WHY ARE THERE SO MANY PROGRAMMING LANGUAGES?\n" +
                "\uF06F Why do some people speak French, Spanish and Chinese etc? \uF06F Programming languages have evolved over time as better ways have been developed to design them. The first programming languages were developed in the 1950s and since then thousands of languages have been developed. \uF06F Different programming languages are designed for different types of programs.\n" +
                "LANGUAGE FAMILY\n" +
                "LEVELS OF PROGRAMMING LANGUAGES\n" +
                "\uF06F High-level program \uF06F Class Triangle \uF06F { \uF06F float surface( ); \uF06F return b*h/2; \uF06F }\n" +
                "LEVELS OF PROGRAMMING LANGUAGES contd….\n" +
                "\uF06F Low-level program  \uF06F Assembly Language closer to Machine Language / Code \uF06F LOAD r1, b \uF06F LOAD r \uF06F MUL r \uF06F DIV r \uF06F RET h, r2\n" +
                "LEVELS OF PROGRAMMING LANGUAGES contd….\n" +
                "\uF06F Executable Machine Code 0001001001000101001001001110110010101101001 1101010010110010101010010010011101100101011\n" +
                "TYPES OF PROGRAMMING LANGUAGES\n" +
                "\uF06F First Generation Languages \uF06F Second Generation Languages \uF06F Third Generation Languages \uF06F Fourth Generation Languages \uF06F Fifth Generation Languages\n" +
                "First Generation Languages\n" +
                "\uF06F Machine language \uF06F Machine language is machine dependent as it is the only language the computer can understand. \uF06F Very efficient code but very difficult to write, read and edit. E.g.01010 0010 1110 1111 00010 1010 1110 1111 11010 0010 1110 1111 01110 1010 1110 1111 01010 0010 1110 1111 11010 0010 1110 1111\n" +
                "Second Generation Languages\n" +
                "\uF06F Assembly languages \uF06F Symbolic operation codes are replaced by binary operation codes. \uF06F Assembly language programs need to be assembled by the assembler for execution by the computer. Each assembly language instruction is translated into one machine language instruction. \uF06F Very efficient code and easier to write. Example; LOAD X ADD R1, R2 JUMP\n" +
                "Third Generation Languages\n" +
                "\uF06F Closer to English but includes simple mathematical notation. \uF06F Programs in source code must be translated into machine language programs called object code. \uF06F The translation of source code to object code is accomplished by a machine language system program called a compiler. \uF06F Alternative to compilation is interpretation which is accomplished by a system program called an interpreter. Some common third generation languages; \uF06F FORTRAN \uF06F COBOL \uF06F C and C++ \uF06F Visual Basic\n" +
                "Fourth Generation Languages\n" +
                "\uF06F A high level language (4GL) that requires fewer instructions to accomplish a task than a third generation language. \uF06F Used with databases \uF06F Query languages \uF06F Report generators \uF06F Forms designers \uF06F Application generators\n" +
                "Fifth Generation Languages\n" +
                "\uF06F Declarative languages \uF06F Functional: Lisp, Scheme, SML \uF06F Also called applicative \uF06F Everything is a function \uF06F Logic: Prolog \uF06F Based on mathematical logic \uF06F Rule-or Constraint-based\n" +
                "Beyond Fifth Generation Languages\n" +
                "\uF06F Some talk about \uF06F Agent Oriented Programming: Agent-oriented programming (AOP) is a programming paradigm where the construction of the software is centered on the concept of software agents. \uF06F Aspect Oriented Programming: Aspect-oriented programming (AOP) is a programming paradigm which aims to increase modularity by allowing the separation of cross-cutting concerns. \uF06F Intentional Programming: Intentional programming is a collection of concepts which enable software source code to reflect the precise information, called intention, which programmers had in mind when conceiving their work. \uF06F Natural language programming: Natural language programming is a way of programming in terms of natural language sentences. \uF06F **Maybe you will invent the next big programming language**\n" +
                "THE PROGRAMMING LANGUAGE PARADIGMS\n" +
                "\uF06F Imperative Programming: Languages with facilities for assigning values to memory locations. E.g. Algol, Pascal, Ada, C, C++, Java, Smalltalk etc. \uF06F Declarative Programming: Based on relations and functions in which the programmer does not consider the assignment of values to memory/storage locations. E.g. Prolog, Lisps, SQL etc. \n" +
                "THE PROGRAMMING LANGUAGE PARADIGMS contd….\n" +
                "PROGRAMMING LANGUAGES CLASSIFICATION\n" +
                "\uF06F Two broad categories /groups; \uF06F Traditional programming languages \uF06F Sequences of instructions \uF06F First, second and some third generation languages \uF06F Object-oriented languages \uF06F Objects are created rather than sequences of instructions \uF06F Some third generation, and fourth and fifth generation languages.\n" +
                "LANGUAGE THEORY \n" +
                "\uF06F Programming languages are languages \uF06F When it comes to mechanics of the task, learning to speak and use a programming language is in many ways like learning to speak a human language \uF06F In both kind of languages you have to learn new vocabulary, syntax and semantics (new words, sentence structure and meaning) \uF06F And both kind of language require considerable practice to make perfect. \uF06F But there is a difference; \uF06F Computer languages lack ambiguity and vagueness \uF06F For example, in English sentences such as “Take a pinch of salt” are ambiguous \uF06F In a programming language a sentence either means one thing or it means nothing.\n" +
                "PROGRAMMING LANGUAGE SPECIFICATION\n" +
                "\uF06F It is a way of communication between people who need to have a common understanding of the programming languages thus; \uF06F Language designer \uF06F Language implementer \uF06F Language user (a.k.a. Software Programmer) \uF06F What to specify? \uF06F Specify what a well formed program is. \uF06F Syntax \uF06F Contextual constraints (also called static semantics) \uF06F Scope rules \uF06F Type rules \uF06F Specify what the meaning of (well formed) programs is. \uF06F Semantics (also called runtime semantics)\n" +
                "PROGRAMMING LANGUAGE SPECIFICATION contd….\n" +
                "\uF06F A Language specification has at least three parts: \uF06F Syntax of the language: \uF06F Contextual constraints: \uF06F Scope rules (often written in English, but can be formal) \uF06F Type rules (formal or informal) \uF06F Semantics: \uF06F defined by the implementation \uF06F informal descriptions in English \uF06F formal using operational or de-notational semantics \uF06F Semantics is concerned with the meaning of programs i.e., programs behavior when run. \uF06F Command is executed to update variables (effect: performing inputoutput) \uF06F Expression is evaluated to yield a value (effect: updating variables) \uF06F Declaration is elaborated to produce bindings (effect: allocating and initializing variables)\n" +
                "PROGRAMMING LANGUAGE SPECIFICATION contd….\n" +
                "\uF06F Syntax is the visible part of a programming language \uF06F Programming Language designers can waste a lot of time discussing unimportant details of syntax \uF06F The language paradigm is the next most visible part \uF06F The choice of paradigm, and therefore language, depends on how human’s best think about the problem. \uF06F There are no right models of computations –just different models of computations, some more suited for certain classes of problems than others. \uF06F The most invisible part is the language semantics \uF06F Clear semantics usually leads to simple and efficient implementations\n" +
                "PROGRAMMING LANGUAGE SPECIFICATION contd….\n" +
                "\uF06F Usually CFG are written in Bachus Naur Form or BNF notation. \uF06F A production rule in BNF notation is written as:\n" +
                "N: = a \n" +
                "\uF06F Syntax Trees \uF06F A syntax tree is an ordered labeled tree such that: \uF06F terminal nodes (leaf nodes) are labeled by terminal symbols \uF06F non-terminal nodes (internal nodes) are labeled by non terminal symbols. \uF06F each non-terminal node labeled by N has children X1,X2,...Xn (in this order) such that N := X1,X2,...Xn is a production.\n" +
                "PROGRAMMING LANGUAGE PROCESSORS\n" +
                "\uF06F Programming Language Processor is any system (software or hardware) that manipulates sets of instructions that computers can understand (programs) \uF06F Editors allow a program text to be entered, modified and saved in a file. E.g., Edit Plus. \uF06F Translators translate a text from one language to another language E.g. Google Translator \uF06F Compilers translate a program from a high-level language to a lowlevel language. E.g. javac, gcc, yacc \uF06F Interpreters take a program expressed in a particular language and run it immediately. e.g. Java \uF06F Integrated Development Environment E.g., Borland JBuilder, Eclipse, Visual Studio .NET\n" +
                "BASIC COMPUTER KNOWLEDGE\n" +
                "\uF06F Computer Software: Generic name for all computer programs or sets of instructions that the computer CPU understands and can execute. Two main types; \uF06F System Software (Operating System): Is the master software that controls and manage computer resources such as hardware, memory, HDD, drives, printer etc. Every operating system has its own compiler. Windows, UNIX, Linux, Macintosh OS \uF06F Application Software: Use to undertake specific tasks and problems. \uF06F Word Processing (MS word), Spreadsheet (MS excel), Presentation (Ms Power point), Databases (Ms Access) \uF06F Computer Hardware: Generic name for all computer parts that can be physical touched and repaired. E.g. keyboard, monitor, system unit, mouse, printer, scanner etc.\n" +
                "THE END \uF06F T o b e c o n t i n u e d………………………" ;
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(somemassage);
        message.setText(stringBuilder.toString());

    }
}
