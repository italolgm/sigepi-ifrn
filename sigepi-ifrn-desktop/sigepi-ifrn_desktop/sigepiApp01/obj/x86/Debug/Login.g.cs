﻿#pragma checksum "..\..\..\Login.xaml" "{406ea660-64cf-4c82-b6f0-42d48172a799}" "A2F386332B40260152A45183B306930E"
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.296
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

using System;
using System.Diagnostics;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Effects;
using System.Windows.Media.Imaging;
using System.Windows.Media.Media3D;
using System.Windows.Media.TextFormatting;
using System.Windows.Navigation;
using System.Windows.Shapes;
using sigepiApp01;


namespace sigepiApp01 {
    
    
    /// <summary>
    /// Login
    /// </summary>
    public partial class Login : System.Windows.Window, System.Windows.Markup.IComponentConnector {
        
        
        #line 10 "..\..\..\Login.xaml"
        internal System.Windows.Shapes.Rectangle rectangle1;
        
        #line default
        #line hidden
        
        
        #line 11 "..\..\..\Login.xaml"
        internal System.Windows.Controls.Image sigepi;
        
        #line default
        #line hidden
        
        
        #line 12 "..\..\..\Login.xaml"
        internal System.Windows.Controls.GroupBox groupBox1;
        
        #line default
        #line hidden
        
        
        #line 14 "..\..\..\Login.xaml"
        internal System.Windows.Controls.Button button1;
        
        #line default
        #line hidden
        
        
        #line 15 "..\..\..\Login.xaml"
        internal System.Windows.Controls.TextBox textBox1;
        
        #line default
        #line hidden
        
        
        #line 16 "..\..\..\Login.xaml"
        internal System.Windows.Controls.PasswordBox passwordBox1;
        
        #line default
        #line hidden
        
        
        #line 17 "..\..\..\Login.xaml"
        internal System.Windows.Controls.Label label2;
        
        #line default
        #line hidden
        
        
        #line 18 "..\..\..\Login.xaml"
        internal System.Windows.Controls.Label label1;
        
        #line default
        #line hidden
        
        private bool _contentLoaded;
        
        /// <summary>
        /// InitializeComponent
        /// </summary>
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        public void InitializeComponent() {
            if (_contentLoaded) {
                return;
            }
            _contentLoaded = true;
            System.Uri resourceLocater = new System.Uri("/sigepiApp01;component/login.xaml", System.UriKind.Relative);
            
            #line 1 "..\..\..\Login.xaml"
            System.Windows.Application.LoadComponent(this, resourceLocater);
            
            #line default
            #line hidden
        }
        
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Never)]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Design", "CA1033:InterfaceMethodsShouldBeCallableByChildTypes")]
        void System.Windows.Markup.IComponentConnector.Connect(int connectionId, object target) {
            switch (connectionId)
            {
            case 1:
            this.rectangle1 = ((System.Windows.Shapes.Rectangle)(target));
            return;
            case 2:
            this.sigepi = ((System.Windows.Controls.Image)(target));
            return;
            case 3:
            this.groupBox1 = ((System.Windows.Controls.GroupBox)(target));
            return;
            case 4:
            this.button1 = ((System.Windows.Controls.Button)(target));
            
            #line 14 "..\..\..\Login.xaml"
            this.button1.Click += new System.Windows.RoutedEventHandler(this.autenticarLogin_Click);
            
            #line default
            #line hidden
            return;
            case 5:
            this.textBox1 = ((System.Windows.Controls.TextBox)(target));
            return;
            case 6:
            this.passwordBox1 = ((System.Windows.Controls.PasswordBox)(target));
            return;
            case 7:
            this.label2 = ((System.Windows.Controls.Label)(target));
            return;
            case 8:
            this.label1 = ((System.Windows.Controls.Label)(target));
            return;
            }
            this._contentLoaded = true;
        }
    }
}

